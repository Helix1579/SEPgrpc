// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SEP.proto

package com.sep.protobuf;

public interface ProjectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Project)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string projectName = 2;</code>
   * @return The projectName.
   */
  java.lang.String getProjectName();
  /**
   * <code>string projectName = 2;</code>
   * @return The bytes for projectName.
   */
  com.google.protobuf.ByteString
      getProjectNameBytes();

  /**
   * <code>.User owner = 3;</code>
   * @return Whether the owner field is set.
   */
  boolean hasOwner();
  /**
   * <code>.User owner = 3;</code>
   * @return The owner.
   */
  com.sep.protobuf.User getOwner();
  /**
   * <code>.User owner = 3;</code>
   */
  com.sep.protobuf.UserOrBuilder getOwnerOrBuilder();

  /**
   * <code>bool isCompleted = 4;</code>
   * @return The isCompleted.
   */
  boolean getIsCompleted();
}
