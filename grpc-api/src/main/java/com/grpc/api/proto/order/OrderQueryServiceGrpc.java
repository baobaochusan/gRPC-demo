package com.grpc.api.proto.order;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: order.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OrderQueryServiceGrpc {

  private OrderQueryServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "OrderQueryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.api.proto.order.Buyer,
      com.grpc.api.proto.order.Order> getListOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOrders",
      requestType = com.grpc.api.proto.order.Buyer.class,
      responseType = com.grpc.api.proto.order.Order.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.grpc.api.proto.order.Buyer,
      com.grpc.api.proto.order.Order> getListOrdersMethod() {
    io.grpc.MethodDescriptor<com.grpc.api.proto.order.Buyer, com.grpc.api.proto.order.Order> getListOrdersMethod;
    if ((getListOrdersMethod = OrderQueryServiceGrpc.getListOrdersMethod) == null) {
      synchronized (OrderQueryServiceGrpc.class) {
        if ((getListOrdersMethod = OrderQueryServiceGrpc.getListOrdersMethod) == null) {
          OrderQueryServiceGrpc.getListOrdersMethod = getListOrdersMethod =
              io.grpc.MethodDescriptor.<com.grpc.api.proto.order.Buyer, com.grpc.api.proto.order.Order>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.api.proto.order.Buyer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.api.proto.order.Order.getDefaultInstance()))
              .setSchemaDescriptor(new OrderQueryServiceMethodDescriptorSupplier("ListOrders"))
              .build();
        }
      }
    }
    return getListOrdersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrderQueryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderQueryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderQueryServiceStub>() {
        @java.lang.Override
        public OrderQueryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderQueryServiceStub(channel, callOptions);
        }
      };
    return OrderQueryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrderQueryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderQueryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderQueryServiceBlockingStub>() {
        @java.lang.Override
        public OrderQueryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderQueryServiceBlockingStub(channel, callOptions);
        }
      };
    return OrderQueryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrderQueryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderQueryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderQueryServiceFutureStub>() {
        @java.lang.Override
        public OrderQueryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderQueryServiceFutureStub(channel, callOptions);
        }
      };
    return OrderQueryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void listOrders(com.grpc.api.proto.order.Buyer request,
        io.grpc.stub.StreamObserver<com.grpc.api.proto.order.Order> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOrdersMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service OrderQueryService.
   */
  public static abstract class OrderQueryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OrderQueryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service OrderQueryService.
   */
  public static final class OrderQueryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<OrderQueryServiceStub> {
    private OrderQueryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderQueryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderQueryServiceStub(channel, callOptions);
    }

    /**
     */
    public void listOrders(com.grpc.api.proto.order.Buyer request,
        io.grpc.stub.StreamObserver<com.grpc.api.proto.order.Order> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListOrdersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service OrderQueryService.
   */
  public static final class OrderQueryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OrderQueryServiceBlockingStub> {
    private OrderQueryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderQueryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderQueryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.grpc.api.proto.order.Order> listOrders(
        com.grpc.api.proto.order.Buyer request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListOrdersMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service OrderQueryService.
   */
  public static final class OrderQueryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<OrderQueryServiceFutureStub> {
    private OrderQueryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderQueryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderQueryServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_LIST_ORDERS = 0;

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
        case METHODID_LIST_ORDERS:
          serviceImpl.listOrders((com.grpc.api.proto.order.Buyer) request,
              (io.grpc.stub.StreamObserver<com.grpc.api.proto.order.Order>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getListOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.grpc.api.proto.order.Buyer,
              com.grpc.api.proto.order.Order>(
                service, METHODID_LIST_ORDERS)))
        .build();
  }

  private static abstract class OrderQueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrderQueryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.api.proto.order.OrderProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrderQueryService");
    }
  }

  private static final class OrderQueryServiceFileDescriptorSupplier
      extends OrderQueryServiceBaseDescriptorSupplier {
    OrderQueryServiceFileDescriptorSupplier() {}
  }

  private static final class OrderQueryServiceMethodDescriptorSupplier
      extends OrderQueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    OrderQueryServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (OrderQueryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrderQueryServiceFileDescriptorSupplier())
              .addMethod(getListOrdersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
