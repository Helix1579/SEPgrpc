package com.sep.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: SEP.proto")
public final class TaskServiceGrpc {

  private TaskServiceGrpc() {}

  public static final String SERVICE_NAME = "TaskService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sep.protobuf.CreateTaskDTO,
      com.sep.protobuf.Task> getCreateTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createTask",
      requestType = com.sep.protobuf.CreateTaskDTO.class,
      responseType = com.sep.protobuf.Task.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sep.protobuf.CreateTaskDTO,
      com.sep.protobuf.Task> getCreateTaskMethod() {
    io.grpc.MethodDescriptor<com.sep.protobuf.CreateTaskDTO, com.sep.protobuf.Task> getCreateTaskMethod;
    if ((getCreateTaskMethod = TaskServiceGrpc.getCreateTaskMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getCreateTaskMethod = TaskServiceGrpc.getCreateTaskMethod) == null) {
          TaskServiceGrpc.getCreateTaskMethod = getCreateTaskMethod =
              io.grpc.MethodDescriptor.<com.sep.protobuf.CreateTaskDTO, com.sep.protobuf.Task>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sep.protobuf.CreateTaskDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sep.protobuf.Task.getDefaultInstance()))
              .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("createTask"))
              .build();
        }
      }
    }
    return getCreateTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sep.protobuf.SearchTaskDTO,
      com.sep.protobuf.Task> getGetTasksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTasks",
      requestType = com.sep.protobuf.SearchTaskDTO.class,
      responseType = com.sep.protobuf.Task.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.sep.protobuf.SearchTaskDTO,
      com.sep.protobuf.Task> getGetTasksMethod() {
    io.grpc.MethodDescriptor<com.sep.protobuf.SearchTaskDTO, com.sep.protobuf.Task> getGetTasksMethod;
    if ((getGetTasksMethod = TaskServiceGrpc.getGetTasksMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getGetTasksMethod = TaskServiceGrpc.getGetTasksMethod) == null) {
          TaskServiceGrpc.getGetTasksMethod = getGetTasksMethod =
              io.grpc.MethodDescriptor.<com.sep.protobuf.SearchTaskDTO, com.sep.protobuf.Task>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sep.protobuf.SearchTaskDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sep.protobuf.Task.getDefaultInstance()))
              .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("getTasks"))
              .build();
        }
      }
    }
    return getGetTasksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sep.protobuf.UpdateTaskDTO,
      com.sep.protobuf.Task> getUpdateTasksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateTasks",
      requestType = com.sep.protobuf.UpdateTaskDTO.class,
      responseType = com.sep.protobuf.Task.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sep.protobuf.UpdateTaskDTO,
      com.sep.protobuf.Task> getUpdateTasksMethod() {
    io.grpc.MethodDescriptor<com.sep.protobuf.UpdateTaskDTO, com.sep.protobuf.Task> getUpdateTasksMethod;
    if ((getUpdateTasksMethod = TaskServiceGrpc.getUpdateTasksMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getUpdateTasksMethod = TaskServiceGrpc.getUpdateTasksMethod) == null) {
          TaskServiceGrpc.getUpdateTasksMethod = getUpdateTasksMethod =
              io.grpc.MethodDescriptor.<com.sep.protobuf.UpdateTaskDTO, com.sep.protobuf.Task>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sep.protobuf.UpdateTaskDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sep.protobuf.Task.getDefaultInstance()))
              .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("updateTasks"))
              .build();
        }
      }
    }
    return getUpdateTasksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sep.protobuf.SearchTaskDTO,
      com.sep.protobuf.Task> getDeleteTasksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteTasks",
      requestType = com.sep.protobuf.SearchTaskDTO.class,
      responseType = com.sep.protobuf.Task.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sep.protobuf.SearchTaskDTO,
      com.sep.protobuf.Task> getDeleteTasksMethod() {
    io.grpc.MethodDescriptor<com.sep.protobuf.SearchTaskDTO, com.sep.protobuf.Task> getDeleteTasksMethod;
    if ((getDeleteTasksMethod = TaskServiceGrpc.getDeleteTasksMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getDeleteTasksMethod = TaskServiceGrpc.getDeleteTasksMethod) == null) {
          TaskServiceGrpc.getDeleteTasksMethod = getDeleteTasksMethod =
              io.grpc.MethodDescriptor.<com.sep.protobuf.SearchTaskDTO, com.sep.protobuf.Task>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sep.protobuf.SearchTaskDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sep.protobuf.Task.getDefaultInstance()))
              .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("deleteTasks"))
              .build();
        }
      }
    }
    return getDeleteTasksMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TaskServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TaskServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TaskServiceStub>() {
        @java.lang.Override
        public TaskServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TaskServiceStub(channel, callOptions);
        }
      };
    return TaskServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TaskServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TaskServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TaskServiceBlockingStub>() {
        @java.lang.Override
        public TaskServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TaskServiceBlockingStub(channel, callOptions);
        }
      };
    return TaskServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TaskServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TaskServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TaskServiceFutureStub>() {
        @java.lang.Override
        public TaskServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TaskServiceFutureStub(channel, callOptions);
        }
      };
    return TaskServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TaskServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createTask(com.sep.protobuf.CreateTaskDTO request,
        io.grpc.stub.StreamObserver<com.sep.protobuf.Task> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTaskMethod(), responseObserver);
    }

    /**
     */
    public void getTasks(com.sep.protobuf.SearchTaskDTO request,
        io.grpc.stub.StreamObserver<com.sep.protobuf.Task> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTasksMethod(), responseObserver);
    }

    /**
     */
    public void updateTasks(com.sep.protobuf.UpdateTaskDTO request,
        io.grpc.stub.StreamObserver<com.sep.protobuf.Task> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTasksMethod(), responseObserver);
    }

    /**
     */
    public void deleteTasks(com.sep.protobuf.SearchTaskDTO request,
        io.grpc.stub.StreamObserver<com.sep.protobuf.Task> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTasksMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateTaskMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sep.protobuf.CreateTaskDTO,
                com.sep.protobuf.Task>(
                  this, METHODID_CREATE_TASK)))
          .addMethod(
            getGetTasksMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.sep.protobuf.SearchTaskDTO,
                com.sep.protobuf.Task>(
                  this, METHODID_GET_TASKS)))
          .addMethod(
            getUpdateTasksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sep.protobuf.UpdateTaskDTO,
                com.sep.protobuf.Task>(
                  this, METHODID_UPDATE_TASKS)))
          .addMethod(
            getDeleteTasksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sep.protobuf.SearchTaskDTO,
                com.sep.protobuf.Task>(
                  this, METHODID_DELETE_TASKS)))
          .build();
    }
  }

  /**
   */
  public static final class TaskServiceStub extends io.grpc.stub.AbstractAsyncStub<TaskServiceStub> {
    private TaskServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TaskServiceStub(channel, callOptions);
    }

    /**
     */
    public void createTask(com.sep.protobuf.CreateTaskDTO request,
        io.grpc.stub.StreamObserver<com.sep.protobuf.Task> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTasks(com.sep.protobuf.SearchTaskDTO request,
        io.grpc.stub.StreamObserver<com.sep.protobuf.Task> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetTasksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTasks(com.sep.protobuf.UpdateTaskDTO request,
        io.grpc.stub.StreamObserver<com.sep.protobuf.Task> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTasksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTasks(com.sep.protobuf.SearchTaskDTO request,
        io.grpc.stub.StreamObserver<com.sep.protobuf.Task> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTasksMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TaskServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TaskServiceBlockingStub> {
    private TaskServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TaskServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sep.protobuf.Task createTask(com.sep.protobuf.CreateTaskDTO request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.sep.protobuf.Task> getTasks(
        com.sep.protobuf.SearchTaskDTO request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetTasksMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sep.protobuf.Task updateTasks(com.sep.protobuf.UpdateTaskDTO request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTasksMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sep.protobuf.Task deleteTasks(com.sep.protobuf.SearchTaskDTO request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTasksMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TaskServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TaskServiceFutureStub> {
    private TaskServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TaskServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sep.protobuf.Task> createTask(
        com.sep.protobuf.CreateTaskDTO request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sep.protobuf.Task> updateTasks(
        com.sep.protobuf.UpdateTaskDTO request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTasksMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sep.protobuf.Task> deleteTasks(
        com.sep.protobuf.SearchTaskDTO request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTasksMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TASK = 0;
  private static final int METHODID_GET_TASKS = 1;
  private static final int METHODID_UPDATE_TASKS = 2;
  private static final int METHODID_DELETE_TASKS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TaskServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TaskServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TASK:
          serviceImpl.createTask((com.sep.protobuf.CreateTaskDTO) request,
              (io.grpc.stub.StreamObserver<com.sep.protobuf.Task>) responseObserver);
          break;
        case METHODID_GET_TASKS:
          serviceImpl.getTasks((com.sep.protobuf.SearchTaskDTO) request,
              (io.grpc.stub.StreamObserver<com.sep.protobuf.Task>) responseObserver);
          break;
        case METHODID_UPDATE_TASKS:
          serviceImpl.updateTasks((com.sep.protobuf.UpdateTaskDTO) request,
              (io.grpc.stub.StreamObserver<com.sep.protobuf.Task>) responseObserver);
          break;
        case METHODID_DELETE_TASKS:
          serviceImpl.deleteTasks((com.sep.protobuf.SearchTaskDTO) request,
              (io.grpc.stub.StreamObserver<com.sep.protobuf.Task>) responseObserver);
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

  private static abstract class TaskServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TaskServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sep.protobuf.SEP.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TaskService");
    }
  }

  private static final class TaskServiceFileDescriptorSupplier
      extends TaskServiceBaseDescriptorSupplier {
    TaskServiceFileDescriptorSupplier() {}
  }

  private static final class TaskServiceMethodDescriptorSupplier
      extends TaskServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TaskServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TaskServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TaskServiceFileDescriptorSupplier())
              .addMethod(getCreateTaskMethod())
              .addMethod(getGetTasksMethod())
              .addMethod(getUpdateTasksMethod())
              .addMethod(getDeleteTasksMethod())
              .build();
        }
      }
    }
    return result;
  }
}
