// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order.proto

package com.grpc.api.proto.order;

public interface OrderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Order)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 orderId = 1;</code>
   * @return The orderId.
   */
  int getOrderId();

  /**
   * <code>int32 productId = 2;</code>
   * @return The productId.
   */
  int getProductId();

  /**
   * <code>int64 orderTime = 3;</code>
   * @return The orderTime.
   */
  long getOrderTime();

  /**
   * <code>string buyerRemark = 4;</code>
   * @return The buyerRemark.
   */
  java.lang.String getBuyerRemark();
  /**
   * <code>string buyerRemark = 4;</code>
   * @return The bytes for buyerRemark.
   */
  com.google.protobuf.ByteString
      getBuyerRemarkBytes();
}
