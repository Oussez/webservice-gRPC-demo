package com.Oussez.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: bank.proto")
public final class BankServiceGrpc {

  private BankServiceGrpc() {}

  public static final String SERVICE_NAME = "BankService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.Oussez.stubs.Bank.ConvertCurrencyRequest,
      com.Oussez.stubs.Bank.ConvertCurrencyResponse> getConvertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convert",
      requestType = com.Oussez.stubs.Bank.ConvertCurrencyRequest.class,
      responseType = com.Oussez.stubs.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.Oussez.stubs.Bank.ConvertCurrencyRequest,
      com.Oussez.stubs.Bank.ConvertCurrencyResponse> getConvertMethod() {
    io.grpc.MethodDescriptor<com.Oussez.stubs.Bank.ConvertCurrencyRequest, com.Oussez.stubs.Bank.ConvertCurrencyResponse> getConvertMethod;
    if ((getConvertMethod = BankServiceGrpc.getConvertMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getConvertMethod = BankServiceGrpc.getConvertMethod) == null) {
          BankServiceGrpc.getConvertMethod = getConvertMethod = 
              io.grpc.MethodDescriptor.<com.Oussez.stubs.Bank.ConvertCurrencyRequest, com.Oussez.stubs.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "convert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Oussez.stubs.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Oussez.stubs.Bank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("convert"))
                  .build();
          }
        }
     }
     return getConvertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.Oussez.stubs.Bank.ConvertCurrencyRequest,
      com.Oussez.stubs.Bank.ConvertCurrencyResponse> getConvertStreamServerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convertStreamServer",
      requestType = com.Oussez.stubs.Bank.ConvertCurrencyRequest.class,
      responseType = com.Oussez.stubs.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.Oussez.stubs.Bank.ConvertCurrencyRequest,
      com.Oussez.stubs.Bank.ConvertCurrencyResponse> getConvertStreamServerMethod() {
    io.grpc.MethodDescriptor<com.Oussez.stubs.Bank.ConvertCurrencyRequest, com.Oussez.stubs.Bank.ConvertCurrencyResponse> getConvertStreamServerMethod;
    if ((getConvertStreamServerMethod = BankServiceGrpc.getConvertStreamServerMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getConvertStreamServerMethod = BankServiceGrpc.getConvertStreamServerMethod) == null) {
          BankServiceGrpc.getConvertStreamServerMethod = getConvertStreamServerMethod = 
              io.grpc.MethodDescriptor.<com.Oussez.stubs.Bank.ConvertCurrencyRequest, com.Oussez.stubs.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "convertStreamServer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Oussez.stubs.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Oussez.stubs.Bank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("convertStreamServer"))
                  .build();
          }
        }
     }
     return getConvertStreamServerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.Oussez.stubs.Bank.ConvertCurrencyRequest,
      com.Oussez.stubs.Bank.ConvertCurrencyResponse> getConvertStreamClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convertStreamClient",
      requestType = com.Oussez.stubs.Bank.ConvertCurrencyRequest.class,
      responseType = com.Oussez.stubs.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.Oussez.stubs.Bank.ConvertCurrencyRequest,
      com.Oussez.stubs.Bank.ConvertCurrencyResponse> getConvertStreamClientMethod() {
    io.grpc.MethodDescriptor<com.Oussez.stubs.Bank.ConvertCurrencyRequest, com.Oussez.stubs.Bank.ConvertCurrencyResponse> getConvertStreamClientMethod;
    if ((getConvertStreamClientMethod = BankServiceGrpc.getConvertStreamClientMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getConvertStreamClientMethod = BankServiceGrpc.getConvertStreamClientMethod) == null) {
          BankServiceGrpc.getConvertStreamClientMethod = getConvertStreamClientMethod = 
              io.grpc.MethodDescriptor.<com.Oussez.stubs.Bank.ConvertCurrencyRequest, com.Oussez.stubs.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "convertStreamClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Oussez.stubs.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Oussez.stubs.Bank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("convertStreamClient"))
                  .build();
          }
        }
     }
     return getConvertStreamClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.Oussez.stubs.Bank.ConvertCurrencyRequest,
      com.Oussez.stubs.Bank.ConvertCurrencyResponse> getConvertStreamCltSrvMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convertStreamCltSrv",
      requestType = com.Oussez.stubs.Bank.ConvertCurrencyRequest.class,
      responseType = com.Oussez.stubs.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.Oussez.stubs.Bank.ConvertCurrencyRequest,
      com.Oussez.stubs.Bank.ConvertCurrencyResponse> getConvertStreamCltSrvMethod() {
    io.grpc.MethodDescriptor<com.Oussez.stubs.Bank.ConvertCurrencyRequest, com.Oussez.stubs.Bank.ConvertCurrencyResponse> getConvertStreamCltSrvMethod;
    if ((getConvertStreamCltSrvMethod = BankServiceGrpc.getConvertStreamCltSrvMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getConvertStreamCltSrvMethod = BankServiceGrpc.getConvertStreamCltSrvMethod) == null) {
          BankServiceGrpc.getConvertStreamCltSrvMethod = getConvertStreamCltSrvMethod = 
              io.grpc.MethodDescriptor.<com.Oussez.stubs.Bank.ConvertCurrencyRequest, com.Oussez.stubs.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "convertStreamCltSrv"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Oussez.stubs.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Oussez.stubs.Bank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("convertStreamCltSrv"))
                  .build();
          }
        }
     }
     return getConvertStreamCltSrvMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.Oussez.stubs.Bank.listAccountRequest,
      com.Oussez.stubs.Bank.listAccount> getGetListAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListAccount",
      requestType = com.Oussez.stubs.Bank.listAccountRequest.class,
      responseType = com.Oussez.stubs.Bank.listAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.Oussez.stubs.Bank.listAccountRequest,
      com.Oussez.stubs.Bank.listAccount> getGetListAccountMethod() {
    io.grpc.MethodDescriptor<com.Oussez.stubs.Bank.listAccountRequest, com.Oussez.stubs.Bank.listAccount> getGetListAccountMethod;
    if ((getGetListAccountMethod = BankServiceGrpc.getGetListAccountMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetListAccountMethod = BankServiceGrpc.getGetListAccountMethod) == null) {
          BankServiceGrpc.getGetListAccountMethod = getGetListAccountMethod = 
              io.grpc.MethodDescriptor.<com.Oussez.stubs.Bank.listAccountRequest, com.Oussez.stubs.Bank.listAccount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getListAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Oussez.stubs.Bank.listAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Oussez.stubs.Bank.listAccount.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getListAccount"))
                  .build();
          }
        }
     }
     return getGetListAccountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BankServiceStub newStub(io.grpc.Channel channel) {
    return new BankServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BankServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BankServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BankServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BankServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BankServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Type of communication
     * </pre>
     */
    public void convert(com.Oussez.stubs.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<com.Oussez.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConvertMethod(), responseObserver);
    }

    /**
     * <pre>
     *type : Server Streaming model
     * </pre>
     */
    public void convertStreamServer(com.Oussez.stubs.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<com.Oussez.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConvertStreamServerMethod(), responseObserver);
    }

    /**
     * <pre>
     * type : Client Streaming model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.Oussez.stubs.Bank.ConvertCurrencyRequest> convertStreamClient(
        io.grpc.stub.StreamObserver<com.Oussez.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getConvertStreamClientMethod(), responseObserver);
    }

    /**
     * <pre>
     * type : Bi-directional Streaming model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.Oussez.stubs.Bank.ConvertCurrencyRequest> convertStreamCltSrv(
        io.grpc.stub.StreamObserver<com.Oussez.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getConvertStreamCltSrvMethod(), responseObserver);
    }

    /**
     */
    public void getListAccount(com.Oussez.stubs.Bank.listAccountRequest request,
        io.grpc.stub.StreamObserver<com.Oussez.stubs.Bank.listAccount> responseObserver) {
      asyncUnimplementedUnaryCall(getGetListAccountMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConvertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.Oussez.stubs.Bank.ConvertCurrencyRequest,
                com.Oussez.stubs.Bank.ConvertCurrencyResponse>(
                  this, METHODID_CONVERT)))
          .addMethod(
            getConvertStreamServerMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.Oussez.stubs.Bank.ConvertCurrencyRequest,
                com.Oussez.stubs.Bank.ConvertCurrencyResponse>(
                  this, METHODID_CONVERT_STREAM_SERVER)))
          .addMethod(
            getConvertStreamClientMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.Oussez.stubs.Bank.ConvertCurrencyRequest,
                com.Oussez.stubs.Bank.ConvertCurrencyResponse>(
                  this, METHODID_CONVERT_STREAM_CLIENT)))
          .addMethod(
            getConvertStreamCltSrvMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.Oussez.stubs.Bank.ConvertCurrencyRequest,
                com.Oussez.stubs.Bank.ConvertCurrencyResponse>(
                  this, METHODID_CONVERT_STREAM_CLT_SRV)))
          .addMethod(
            getGetListAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.Oussez.stubs.Bank.listAccountRequest,
                com.Oussez.stubs.Bank.listAccount>(
                  this, METHODID_GET_LIST_ACCOUNT)))
          .build();
    }
  }

  /**
   */
  public static final class BankServiceStub extends io.grpc.stub.AbstractStub<BankServiceStub> {
    private BankServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Type of communication
     * </pre>
     */
    public void convert(com.Oussez.stubs.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<com.Oussez.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *type : Server Streaming model
     * </pre>
     */
    public void convertStreamServer(com.Oussez.stubs.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<com.Oussez.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getConvertStreamServerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * type : Client Streaming model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.Oussez.stubs.Bank.ConvertCurrencyRequest> convertStreamClient(
        io.grpc.stub.StreamObserver<com.Oussez.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getConvertStreamClientMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * type : Bi-directional Streaming model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.Oussez.stubs.Bank.ConvertCurrencyRequest> convertStreamCltSrv(
        io.grpc.stub.StreamObserver<com.Oussez.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getConvertStreamCltSrvMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void getListAccount(com.Oussez.stubs.Bank.listAccountRequest request,
        io.grpc.stub.StreamObserver<com.Oussez.stubs.Bank.listAccount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetListAccountMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BankServiceBlockingStub extends io.grpc.stub.AbstractStub<BankServiceBlockingStub> {
    private BankServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Type of communication
     * </pre>
     */
    public com.Oussez.stubs.Bank.ConvertCurrencyResponse convert(com.Oussez.stubs.Bank.ConvertCurrencyRequest request) {
      return blockingUnaryCall(
          getChannel(), getConvertMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *type : Server Streaming model
     * </pre>
     */
    public java.util.Iterator<com.Oussez.stubs.Bank.ConvertCurrencyResponse> convertStreamServer(
        com.Oussez.stubs.Bank.ConvertCurrencyRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getConvertStreamServerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.Oussez.stubs.Bank.listAccount getListAccount(com.Oussez.stubs.Bank.listAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetListAccountMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BankServiceFutureStub extends io.grpc.stub.AbstractStub<BankServiceFutureStub> {
    private BankServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Type of communication
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.Oussez.stubs.Bank.ConvertCurrencyResponse> convert(
        com.Oussez.stubs.Bank.ConvertCurrencyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.Oussez.stubs.Bank.listAccount> getListAccount(
        com.Oussez.stubs.Bank.listAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetListAccountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONVERT = 0;
  private static final int METHODID_CONVERT_STREAM_SERVER = 1;
  private static final int METHODID_GET_LIST_ACCOUNT = 2;
  private static final int METHODID_CONVERT_STREAM_CLIENT = 3;
  private static final int METHODID_CONVERT_STREAM_CLT_SRV = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BankServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BankServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONVERT:
          serviceImpl.convert((com.Oussez.stubs.Bank.ConvertCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<com.Oussez.stubs.Bank.ConvertCurrencyResponse>) responseObserver);
          break;
        case METHODID_CONVERT_STREAM_SERVER:
          serviceImpl.convertStreamServer((com.Oussez.stubs.Bank.ConvertCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<com.Oussez.stubs.Bank.ConvertCurrencyResponse>) responseObserver);
          break;
        case METHODID_GET_LIST_ACCOUNT:
          serviceImpl.getListAccount((com.Oussez.stubs.Bank.listAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.Oussez.stubs.Bank.listAccount>) responseObserver);
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
        case METHODID_CONVERT_STREAM_CLIENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.convertStreamClient(
              (io.grpc.stub.StreamObserver<com.Oussez.stubs.Bank.ConvertCurrencyResponse>) responseObserver);
        case METHODID_CONVERT_STREAM_CLT_SRV:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.convertStreamCltSrv(
              (io.grpc.stub.StreamObserver<com.Oussez.stubs.Bank.ConvertCurrencyResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BankServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.Oussez.stubs.Bank.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BankService");
    }
  }

  private static final class BankServiceFileDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier {
    BankServiceFileDescriptorSupplier() {}
  }

  private static final class BankServiceMethodDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BankServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BankServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BankServiceFileDescriptorSupplier())
              .addMethod(getConvertMethod())
              .addMethod(getConvertStreamServerMethod())
              .addMethod(getConvertStreamClientMethod())
              .addMethod(getConvertStreamCltSrvMethod())
              .addMethod(getGetListAccountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
