// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SEP.proto

package com.sep.protobuf;

public interface CreateTaskDTOOrBuilder extends
    // @@protoc_insertion_point(interface_extends:CreateTaskDTO)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 projectId = 1;</code>
   * @return The projectId.
   */
  long getProjectId();

  /**
   * <code>int64 ownerId = 2;</code>
   * @return The ownerId.
   */
  long getOwnerId();

  /**
   * <code>string title = 3;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 3;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();
}
