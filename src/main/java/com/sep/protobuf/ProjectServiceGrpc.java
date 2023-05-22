package com.sep.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: SEP.proto")
public final class ProjectServiceGrpc {

  private ProjectServiceGrpc() {}

  public static final String SERVICE_NAME = "ProjectService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sep.protobuf.CreateProjectDTO,
      com.sep.protobuf.Project> getCreateProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createProject",
      requestType = com.sep.protobuf.CreateProjectDTO.class,
      responseType = com.sep.protobuf.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sep.protobuf.CreateProjectDTO,
      com.sep.protobuf.Project> getCreateProjectMethod() {
    io.grpc.MethodDescriptor<com.sep.protobuf.CreateProjectDTO, com.sep.protobuf.Project> getCreateProjectMethod;
    if ((getCreateProjectMethod = ProjectServiceGrpc.getCreateProjectMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getCreateProjectMethod = ProjectServiceGrpc.getCreateProjectMethod) == null) {
          ProjectServiceGrpc.getCreateProjectMethod = getCreateProjectMethod =
              io.grpc.MethodDescriptor.<com.sep.protobuf.CreateProjectDTO, com.sep.protobuf.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sep.protobuf.CreateProjectDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sep.protobuf.Project.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("createProject"))
              .build();
        }
      }
    }
    return getCreateProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sep.protobuf.SearchProjectDTO,
      com.sep.protobuf.Project> getGetProjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProjects",
      requestType = com.sep.protobuf.SearchProjectDTO.class,
      responseType = com.sep.protobuf.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.sep.protobuf.SearchProjectDTO,
      com.sep.protobuf.Project> getGetProjectsMethod() {
    io.grpc.MethodDescriptor<com.sep.protobuf.SearchProjectDTO, com.sep.protobuf.Project> getGetProjectsMethod;
    if ((getGetProjectsMethod = ProjectServiceGrpc.getGetProjectsMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getGetProjectsMethod = ProjectServiceGrpc.getGetProjectsMethod) == null) {
          ProjectServiceGrpc.getGetProjectsMethod = getGetProjectsMethod =
              io.grpc.MethodDescriptor.<com.sep.protobuf.SearchProjectDTO, com.sep.protobuf.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sep.protobuf.SearchProjectDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sep.protobuf.Project.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("getProjects"))
              .build();
        }
      }
    }
    return getGetProjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sep.protobuf.UpdateProjectDTO,
      com.sep.protobuf.Project> getUpdateProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateProject",
      requestType = com.sep.protobuf.UpdateProjectDTO.class,
      responseType = com.sep.protobuf.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sep.protobuf.UpdateProjectDTO,
      com.sep.protobuf.Project> getUpdateProjectMethod() {
    io.grpc.MethodDescriptor<com.sep.protobuf.UpdateProjectDTO, com.sep.protobuf.Project> getUpdateProjectMethod;
    if ((getUpdateProjectMethod = ProjectServiceGrpc.getUpdateProjectMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getUpdateProjectMethod = ProjectServiceGrpc.getUpdateProjectMethod) == null) {
          ProjectServiceGrpc.getUpdateProjectMethod = getUpdateProjectMethod =
              io.grpc.MethodDescriptor.<com.sep.protobuf.UpdateProjectDTO, com.sep.protobuf.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sep.protobuf.UpdateProjectDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sep.protobuf.Project.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("updateProject"))
              .build();
        }
      }
    }
    return getUpdateProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sep.protobuf.SearchProjectDTO,
      com.sep.protobuf.Project> getDeleteProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteProject",
      requestType = com.sep.protobuf.SearchProjectDTO.class,
      responseType = com.sep.protobuf.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sep.protobuf.SearchProjectDTO,
      com.sep.protobuf.Project> getDeleteProjectMethod() {
    io.grpc.MethodDescriptor<com.sep.protobuf.SearchProjectDTO, com.sep.protobuf.Project> getDeleteProjectMethod;
    if ((getDeleteProjectMethod = ProjectServiceGrpc.getDeleteProjectMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getDeleteProjectMethod = ProjectServiceGrpc.getDeleteProjectMethod) == null) {
          ProjectServiceGrpc.getDeleteProjectMethod = getDeleteProjectMethod =
              io.grpc.MethodDescriptor.<com.sep.protobuf.SearchProjectDTO, com.sep.protobuf.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sep.protobuf.SearchProjectDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sep.protobuf.Project.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("deleteProject"))
              .build();
        }
      }
    }
    return getDeleteProjectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProjectServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectServiceStub>() {
        @java.lang.Override
        public ProjectServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectServiceStub(channel, callOptions);
        }
      };
    return ProjectServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProjectServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectServiceBlockingStub>() {
        @java.lang.Override
        public ProjectServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectServiceBlockingStub(channel, callOptions);
        }
      };
    return ProjectServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProjectServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectServiceFutureStub>() {
        @java.lang.Override
        public ProjectServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectServiceFutureStub(channel, callOptions);
        }
      };
    return ProjectServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ProjectServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createProject(com.sep.protobuf.CreateProjectDTO request,
        io.grpc.stub.StreamObserver<com.sep.protobuf.Project> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProjectMethod(), responseObserver);
    }

    /**
     */
    public void getProjects(com.sep.protobuf.SearchProjectDTO request,
        io.grpc.stub.StreamObserver<com.sep.protobuf.Project> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProjectsMethod(), responseObserver);
    }

    /**
     */
    public void updateProject(com.sep.protobuf.UpdateProjectDTO request,
        io.grpc.stub.StreamObserver<com.sep.protobuf.Project> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProjectMethod(), responseObserver);
    }

    /**
     */
    public void deleteProject(com.sep.protobuf.SearchProjectDTO request,
        io.grpc.stub.StreamObserver<com.sep.protobuf.Project> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteProjectMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateProjectMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sep.protobuf.CreateProjectDTO,
                com.sep.protobuf.Project>(
                  this, METHODID_CREATE_PROJECT)))
          .addMethod(
            getGetProjectsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.sep.protobuf.SearchProjectDTO,
                com.sep.protobuf.Project>(
                  this, METHODID_GET_PROJECTS)))
          .addMethod(
            getUpdateProjectMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sep.protobuf.UpdateProjectDTO,
                com.sep.protobuf.Project>(
                  this, METHODID_UPDATE_PROJECT)))
          .addMethod(
            getDeleteProjectMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sep.protobuf.SearchProjectDTO,
                com.sep.protobuf.Project>(
                  this, METHODID_DELETE_PROJECT)))
          .build();
    }
  }

  /**
   */
  public static final class ProjectServiceStub extends io.grpc.stub.AbstractAsyncStub<ProjectServiceStub> {
    private ProjectServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectServiceStub(channel, callOptions);
    }

    /**
     */
    public void createProject(com.sep.protobuf.CreateProjectDTO request,
        io.grpc.stub.StreamObserver<com.sep.protobuf.Project> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProjects(com.sep.protobuf.SearchProjectDTO request,
        io.grpc.stub.StreamObserver<com.sep.protobuf.Project> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetProjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProject(com.sep.protobuf.UpdateProjectDTO request,
        io.grpc.stub.StreamObserver<com.sep.protobuf.Project> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProject(com.sep.protobuf.SearchProjectDTO request,
        io.grpc.stub.StreamObserver<com.sep.protobuf.Project> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteProjectMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProjectServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProjectServiceBlockingStub> {
    private ProjectServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sep.protobuf.Project createProject(com.sep.protobuf.CreateProjectDTO request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.sep.protobuf.Project> getProjects(
        com.sep.protobuf.SearchProjectDTO request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetProjectsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sep.protobuf.Project updateProject(com.sep.protobuf.UpdateProjectDTO request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sep.protobuf.Project deleteProject(com.sep.protobuf.SearchProjectDTO request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteProjectMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProjectServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProjectServiceFutureStub> {
    private ProjectServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sep.protobuf.Project> createProject(
        com.sep.protobuf.CreateProjectDTO request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sep.protobuf.Project> updateProject(
        com.sep.protobuf.UpdateProjectDTO request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sep.protobuf.Project> deleteProject(
        com.sep.protobuf.SearchProjectDTO request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteProjectMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PROJECT = 0;
  private static final int METHODID_GET_PROJECTS = 1;
  private static final int METHODID_UPDATE_PROJECT = 2;
  private static final int METHODID_DELETE_PROJECT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProjectServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProjectServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PROJECT:
          serviceImpl.createProject((com.sep.protobuf.CreateProjectDTO) request,
              (io.grpc.stub.StreamObserver<com.sep.protobuf.Project>) responseObserver);
          break;
        case METHODID_GET_PROJECTS:
          serviceImpl.getProjects((com.sep.protobuf.SearchProjectDTO) request,
              (io.grpc.stub.StreamObserver<com.sep.protobuf.Project>) responseObserver);
          break;
        case METHODID_UPDATE_PROJECT:
          serviceImpl.updateProject((com.sep.protobuf.UpdateProjectDTO) request,
              (io.grpc.stub.StreamObserver<com.sep.protobuf.Project>) responseObserver);
          break;
        case METHODID_DELETE_PROJECT:
          serviceImpl.deleteProject((com.sep.protobuf.SearchProjectDTO) request,
              (io.grpc.stub.StreamObserver<com.sep.protobuf.Project>) responseObserver);
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

  private static abstract class ProjectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProjectServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sep.protobuf.SEP.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProjectService");
    }
  }

  private static final class ProjectServiceFileDescriptorSupplier
      extends ProjectServiceBaseDescriptorSupplier {
    ProjectServiceFileDescriptorSupplier() {}
  }

  private static final class ProjectServiceMethodDescriptorSupplier
      extends ProjectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProjectServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProjectServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProjectServiceFileDescriptorSupplier())
              .addMethod(getCreateProjectMethod())
              .addMethod(getGetProjectsMethod())
              .addMethod(getUpdateProjectMethod())
              .addMethod(getDeleteProjectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
