// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SEP.proto

package com.sep.protobuf;

public interface TaskOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Task)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>.Project belongsTo = 2;</code>
   * @return Whether the belongsTo field is set.
   */
  boolean hasBelongsTo();
  /**
   * <code>.Project belongsTo = 2;</code>
   * @return The belongsTo.
   */
  com.sep.protobuf.Project getBelongsTo();
  /**
   * <code>.Project belongsTo = 2;</code>
   */
  com.sep.protobuf.ProjectOrBuilder getBelongsToOrBuilder();

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

  /**
   * <code>.User owner = 4;</code>
   * @return Whether the owner field is set.
   */
  boolean hasOwner();
  /**
   * <code>.User owner = 4;</code>
   * @return The owner.
   */
  com.sep.protobuf.User getOwner();
  /**
   * <code>.User owner = 4;</code>
   */
  com.sep.protobuf.UserOrBuilder getOwnerOrBuilder();

  /**
   * <code>bool isCompleted = 5;</code>
   * @return The isCompleted.
   */
  boolean getIsCompleted();
}
