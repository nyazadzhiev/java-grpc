package greeting.client;

import com.proto.greeting.GreetingRequest;
import com.proto.greeting.GreetingResponse;
import com.proto.greeting.GreetingServiceGrpc;
import com.proto.sum.SumRequest;
import com.proto.sum.SumResponse;
import com.proto.sum.SumServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class GreetingClient {
    private static void doGreet(ManagedChannel channel) {
        System.out.println("Enter doGreet");
        GreetingServiceGrpc.GreetingServiceBlockingStub stub = GreetingServiceGrpc.newBlockingStub(channel);
        GreetingResponse response = stub.greet(GreetingRequest.newBuilder().setFirstName("John").build());

        System.out.println("Greeting: " + response.getResult());
    }

    private static void doSum(ManagedChannel channel) {
        System.out.println("Enter doSum");
        SumServiceGrpc.SumServiceBlockingStub stub = SumServiceGrpc.newBlockingStub(channel);
        SumResponse response = stub.sum(SumRequest.newBuilder().setNumber1(3).setNumber2(10).build());

        System.out.println("Result: " + response.getResult());
    }

    private static void doPrimes(ManagedChannel channel) {
        System.out.println("Enter doPrimes");
        SumServiceGrpc.SumServiceBlockingStub stub = SumServiceGrpc.newBlockingStub(channel);
        stub.primes(SumRequest.newBuilder().setNumber1(120).setNumber2(10).build()).forEachRemaining(response -> {
            System.out.println(response.getResult());
        });

        //System.out.println("Result: " + response.getResult());
    }

    private static void doAverage(ManagedChannel channel) throws InterruptedException {
        System.out.println("Enter doAverage");
        SumServiceGrpc.SumServiceStub stub = SumServiceGrpc.newStub(channel);
        List<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 1, 2, 3 ,4);
        CountDownLatch latch = new CountDownLatch(1);
        var stream = stub.average(new StreamObserver<SumResponse>() {
            @Override
            public void onNext(SumResponse response) {
                System.out.println(response.getResult());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                latch.countDown();
            }
        });

        for(Integer i : arr) {
            stream.onNext(SumRequest.newBuilder().setNumber1(i).build());
        }

        stream.onCompleted();
        latch.await(3, TimeUnit.SECONDS);
    }

    private static void doMax(ManagedChannel channel) throws InterruptedException {
        System.out.println("Enter doMax");
        SumServiceGrpc.SumServiceStub stub = SumServiceGrpc.newStub(channel);
        CountDownLatch latch = new CountDownLatch(1);
        var stream = stub.max(new StreamObserver<SumResponse>() {
            @Override
            public void onNext(SumResponse response) {
                System.out.println("Max = " + response.getResult());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                latch.countDown();
            }
        });

        Arrays.asList(1,5,3,6,2,20).forEach(i -> {
            stream.onNext(SumRequest.newBuilder().setNumber1(i).build());
        });


        stream.onCompleted();
        latch.await(3, TimeUnit.SECONDS);
    }
    public static void main(String[] args) throws InterruptedException {
        if(args.length == 0){
            System.out.println("Need one argument");
            return;
        }

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        switch (args[0]){
            case "greet": doGreet(channel); break;
            case "sum": doSum(channel); break;
            case "primes": doPrimes(channel); break;
            case "average": doAverage(channel); break;
            case "max": doMax(channel); break;
            default:
                System.out.println("Invalid keyword");
        }

        System.out.println("Shutting down");
        channel.shutdown();
    }
}
