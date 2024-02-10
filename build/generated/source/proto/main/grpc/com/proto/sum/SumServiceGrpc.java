package com.proto.sum;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.0)",
    comments = "Source: sum/sum.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SumServiceGrpc {

  private SumServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "sum.SumService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.sum.SumRequest,
      com.proto.sum.SumResponse> getSumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sum",
      requestType = com.proto.sum.SumRequest.class,
      responseType = com.proto.sum.SumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.sum.SumRequest,
      com.proto.sum.SumResponse> getSumMethod() {
    io.grpc.MethodDescriptor<com.proto.sum.SumRequest, com.proto.sum.SumResponse> getSumMethod;
    if ((getSumMethod = SumServiceGrpc.getSumMethod) == null) {
      synchronized (SumServiceGrpc.class) {
        if ((getSumMethod = SumServiceGrpc.getSumMethod) == null) {
          SumServiceGrpc.getSumMethod = getSumMethod =
              io.grpc.MethodDescriptor.<com.proto.sum.SumRequest, com.proto.sum.SumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.sum.SumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.sum.SumResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SumServiceMethodDescriptorSupplier("sum"))
              .build();
        }
      }
    }
    return getSumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.sum.SumRequest,
      com.proto.sum.SumResponse> getPrimesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "primes",
      requestType = com.proto.sum.SumRequest.class,
      responseType = com.proto.sum.SumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.sum.SumRequest,
      com.proto.sum.SumResponse> getPrimesMethod() {
    io.grpc.MethodDescriptor<com.proto.sum.SumRequest, com.proto.sum.SumResponse> getPrimesMethod;
    if ((getPrimesMethod = SumServiceGrpc.getPrimesMethod) == null) {
      synchronized (SumServiceGrpc.class) {
        if ((getPrimesMethod = SumServiceGrpc.getPrimesMethod) == null) {
          SumServiceGrpc.getPrimesMethod = getPrimesMethod =
              io.grpc.MethodDescriptor.<com.proto.sum.SumRequest, com.proto.sum.SumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "primes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.sum.SumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.sum.SumResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SumServiceMethodDescriptorSupplier("primes"))
              .build();
        }
      }
    }
    return getPrimesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.sum.SumRequest,
      com.proto.sum.SumResponse> getAverageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "average",
      requestType = com.proto.sum.SumRequest.class,
      responseType = com.proto.sum.SumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.sum.SumRequest,
      com.proto.sum.SumResponse> getAverageMethod() {
    io.grpc.MethodDescriptor<com.proto.sum.SumRequest, com.proto.sum.SumResponse> getAverageMethod;
    if ((getAverageMethod = SumServiceGrpc.getAverageMethod) == null) {
      synchronized (SumServiceGrpc.class) {
        if ((getAverageMethod = SumServiceGrpc.getAverageMethod) == null) {
          SumServiceGrpc.getAverageMethod = getAverageMethod =
              io.grpc.MethodDescriptor.<com.proto.sum.SumRequest, com.proto.sum.SumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "average"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.sum.SumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.sum.SumResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SumServiceMethodDescriptorSupplier("average"))
              .build();
        }
      }
    }
    return getAverageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.sum.SumRequest,
      com.proto.sum.SumResponse> getMaxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "max",
      requestType = com.proto.sum.SumRequest.class,
      responseType = com.proto.sum.SumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.sum.SumRequest,
      com.proto.sum.SumResponse> getMaxMethod() {
    io.grpc.MethodDescriptor<com.proto.sum.SumRequest, com.proto.sum.SumResponse> getMaxMethod;
    if ((getMaxMethod = SumServiceGrpc.getMaxMethod) == null) {
      synchronized (SumServiceGrpc.class) {
        if ((getMaxMethod = SumServiceGrpc.getMaxMethod) == null) {
          SumServiceGrpc.getMaxMethod = getMaxMethod =
              io.grpc.MethodDescriptor.<com.proto.sum.SumRequest, com.proto.sum.SumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "max"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.sum.SumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.sum.SumResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SumServiceMethodDescriptorSupplier("max"))
              .build();
        }
      }
    }
    return getMaxMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SumServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SumServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SumServiceStub>() {
        @java.lang.Override
        public SumServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SumServiceStub(channel, callOptions);
        }
      };
    return SumServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SumServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SumServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SumServiceBlockingStub>() {
        @java.lang.Override
        public SumServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SumServiceBlockingStub(channel, callOptions);
        }
      };
    return SumServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SumServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SumServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SumServiceFutureStub>() {
        @java.lang.Override
        public SumServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SumServiceFutureStub(channel, callOptions);
        }
      };
    return SumServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void sum(com.proto.sum.SumRequest request,
        io.grpc.stub.StreamObserver<com.proto.sum.SumResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSumMethod(), responseObserver);
    }

    /**
     */
    default void primes(com.proto.sum.SumRequest request,
        io.grpc.stub.StreamObserver<com.proto.sum.SumResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPrimesMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.proto.sum.SumRequest> average(
        io.grpc.stub.StreamObserver<com.proto.sum.SumResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAverageMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.proto.sum.SumRequest> max(
        io.grpc.stub.StreamObserver<com.proto.sum.SumResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getMaxMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SumService.
   */
  public static abstract class SumServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SumServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SumService.
   */
  public static final class SumServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SumServiceStub> {
    private SumServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SumServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SumServiceStub(channel, callOptions);
    }

    /**
     */
    public void sum(com.proto.sum.SumRequest request,
        io.grpc.stub.StreamObserver<com.proto.sum.SumResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void primes(com.proto.sum.SumRequest request,
        io.grpc.stub.StreamObserver<com.proto.sum.SumResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getPrimesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.sum.SumRequest> average(
        io.grpc.stub.StreamObserver<com.proto.sum.SumResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getAverageMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.sum.SumRequest> max(
        io.grpc.stub.StreamObserver<com.proto.sum.SumResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getMaxMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SumService.
   */
  public static final class SumServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SumServiceBlockingStub> {
    private SumServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SumServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SumServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.sum.SumResponse sum(com.proto.sum.SumRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSumMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.proto.sum.SumResponse> primes(
        com.proto.sum.SumRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getPrimesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SumService.
   */
  public static final class SumServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SumServiceFutureStub> {
    private SumServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SumServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SumServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.sum.SumResponse> sum(
        com.proto.sum.SumRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUM = 0;
  private static final int METHODID_PRIMES = 1;
  private static final int METHODID_AVERAGE = 2;
  private static final int METHODID_MAX = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUM:
          serviceImpl.sum((com.proto.sum.SumRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.sum.SumResponse>) responseObserver);
          break;
        case METHODID_PRIMES:
          serviceImpl.primes((com.proto.sum.SumRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.sum.SumResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AVERAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.average(
              (io.grpc.stub.StreamObserver<com.proto.sum.SumResponse>) responseObserver);
        case METHODID_MAX:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.max(
              (io.grpc.stub.StreamObserver<com.proto.sum.SumResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSumMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.proto.sum.SumRequest,
              com.proto.sum.SumResponse>(
                service, METHODID_SUM)))
        .addMethod(
          getPrimesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.proto.sum.SumRequest,
              com.proto.sum.SumResponse>(
                service, METHODID_PRIMES)))
        .addMethod(
          getAverageMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.proto.sum.SumRequest,
              com.proto.sum.SumResponse>(
                service, METHODID_AVERAGE)))
        .addMethod(
          getMaxMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.proto.sum.SumRequest,
              com.proto.sum.SumResponse>(
                service, METHODID_MAX)))
        .build();
  }

  private static abstract class SumServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SumServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.sum.Sum.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SumService");
    }
  }

  private static final class SumServiceFileDescriptorSupplier
      extends SumServiceBaseDescriptorSupplier {
    SumServiceFileDescriptorSupplier() {}
  }

  private static final class SumServiceMethodDescriptorSupplier
      extends SumServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SumServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SumServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SumServiceFileDescriptorSupplier())
              .addMethod(getSumMethod())
              .addMethod(getPrimesMethod())
              .addMethod(getAverageMethod())
              .addMethod(getMaxMethod())
              .build();
        }
      }
    }
    return result;
  }
}
