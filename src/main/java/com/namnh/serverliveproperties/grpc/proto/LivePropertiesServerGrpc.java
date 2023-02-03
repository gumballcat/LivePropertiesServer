package com.namnh.serverliveproperties.grpc.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: live-properties-server.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LivePropertiesServerGrpc {

  private LivePropertiesServerGrpc() {}

  public static final String SERVICE_NAME = "LivePropertiesServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest,
      com.namnh.serverliveproperties.grpc.proto.GetPropertyResponse> getGetPropertyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProperty",
      requestType = com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest.class,
      responseType = com.namnh.serverliveproperties.grpc.proto.GetPropertyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest,
      com.namnh.serverliveproperties.grpc.proto.GetPropertyResponse> getGetPropertyMethod() {
    io.grpc.MethodDescriptor<com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest, com.namnh.serverliveproperties.grpc.proto.GetPropertyResponse> getGetPropertyMethod;
    if ((getGetPropertyMethod = LivePropertiesServerGrpc.getGetPropertyMethod) == null) {
      synchronized (LivePropertiesServerGrpc.class) {
        if ((getGetPropertyMethod = LivePropertiesServerGrpc.getGetPropertyMethod) == null) {
          LivePropertiesServerGrpc.getGetPropertyMethod = getGetPropertyMethod =
              io.grpc.MethodDescriptor.<com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest, com.namnh.serverliveproperties.grpc.proto.GetPropertyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProperty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.namnh.serverliveproperties.grpc.proto.GetPropertyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LivePropertiesServerMethodDescriptorSupplier("getProperty"))
              .build();
        }
      }
    }
    return getGetPropertyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LivePropertiesServerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LivePropertiesServerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LivePropertiesServerStub>() {
        @java.lang.Override
        public LivePropertiesServerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LivePropertiesServerStub(channel, callOptions);
        }
      };
    return LivePropertiesServerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LivePropertiesServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LivePropertiesServerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LivePropertiesServerBlockingStub>() {
        @java.lang.Override
        public LivePropertiesServerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LivePropertiesServerBlockingStub(channel, callOptions);
        }
      };
    return LivePropertiesServerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LivePropertiesServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LivePropertiesServerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LivePropertiesServerFutureStub>() {
        @java.lang.Override
        public LivePropertiesServerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LivePropertiesServerFutureStub(channel, callOptions);
        }
      };
    return LivePropertiesServerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class LivePropertiesServerImplBase implements io.grpc.BindableService {

    /**
     */
    public void getProperty(com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest request,
        io.grpc.stub.StreamObserver<com.namnh.serverliveproperties.grpc.proto.GetPropertyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPropertyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPropertyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest,
                com.namnh.serverliveproperties.grpc.proto.GetPropertyResponse>(
                  this, METHODID_GET_PROPERTY)))
          .build();
    }
  }

  /**
   */
  public static final class LivePropertiesServerStub extends io.grpc.stub.AbstractAsyncStub<LivePropertiesServerStub> {
    private LivePropertiesServerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LivePropertiesServerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LivePropertiesServerStub(channel, callOptions);
    }

    /**
     */
    public void getProperty(com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest request,
        io.grpc.stub.StreamObserver<com.namnh.serverliveproperties.grpc.proto.GetPropertyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPropertyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LivePropertiesServerBlockingStub extends io.grpc.stub.AbstractBlockingStub<LivePropertiesServerBlockingStub> {
    private LivePropertiesServerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LivePropertiesServerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LivePropertiesServerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.namnh.serverliveproperties.grpc.proto.GetPropertyResponse getProperty(com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPropertyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LivePropertiesServerFutureStub extends io.grpc.stub.AbstractFutureStub<LivePropertiesServerFutureStub> {
    private LivePropertiesServerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LivePropertiesServerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LivePropertiesServerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.namnh.serverliveproperties.grpc.proto.GetPropertyResponse> getProperty(
        com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPropertyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PROPERTY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LivePropertiesServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LivePropertiesServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PROPERTY:
          serviceImpl.getProperty((com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest) request,
              (io.grpc.stub.StreamObserver<com.namnh.serverliveproperties.grpc.proto.GetPropertyResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class LivePropertiesServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LivePropertiesServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.namnh.serverliveproperties.grpc.proto.LivePropertiesServerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LivePropertiesServer");
    }
  }

  private static final class LivePropertiesServerFileDescriptorSupplier
      extends LivePropertiesServerBaseDescriptorSupplier {
    LivePropertiesServerFileDescriptorSupplier() {}
  }

  private static final class LivePropertiesServerMethodDescriptorSupplier
      extends LivePropertiesServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LivePropertiesServerMethodDescriptorSupplier(String methodName) {
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
      synchronized (LivePropertiesServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LivePropertiesServerFileDescriptorSupplier())
              .addMethod(getGetPropertyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
