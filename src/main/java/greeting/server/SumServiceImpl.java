package greeting.server;

import com.proto.greeting.GreetingRequest;
import com.proto.greeting.GreetingResponse;
import com.proto.sum.SumRequest;
import com.proto.sum.SumResponse;
import com.proto.sum.SumServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class SumServiceImpl extends SumServiceGrpc.SumServiceImplBase {
    @Override
    public void sum(SumRequest request, StreamObserver<SumResponse> responseObserver) {
        responseObserver.onNext(SumResponse.newBuilder().setResult(request.getNumber1() + request.getNumber2()).build());
        responseObserver.onCompleted();
    }

    @Override
    public void primes(SumRequest request, StreamObserver<SumResponse> responseObserver) {
        int requestNumber = request.getNumber1();
        int k = 2;
        while (requestNumber > 1){
            if(requestNumber % k == 0) {
                responseObserver.onNext(SumResponse.newBuilder().setResult(k).build());
                requestNumber /= k;
            }
            else
                k++;
        }
        //responseObserver.onNext(SumResponse.newBuilder().setResult(request.getNumber1() + request.getNumber2()).build());
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<SumRequest> average(StreamObserver<SumResponse> responseObserver) {
        List<Integer> arr = new ArrayList<>();
        return new StreamObserver<SumRequest>() {
            @Override
            public void onNext(SumRequest request) {
                arr.add(request.getNumber1());
            }

            @Override
            public void onError(Throwable t) {
                responseObserver.onError(t);
            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(SumResponse.newBuilder().setResult(arr.stream().mapToDouble(a -> a).average().getAsDouble()).build());
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<SumRequest> max(StreamObserver<SumResponse> responseObserver) {
        return new StreamObserver<SumRequest>() {
            int max = 0;

            @Override
            public void onNext(SumRequest request) {
                if(request.getNumber1() > max)
                    max = request.getNumber1();

                responseObserver.onNext(SumResponse.newBuilder().setResult(max).build());
            }

            @Override
            public void onError(Throwable t) {
                responseObserver.onError(t);
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
