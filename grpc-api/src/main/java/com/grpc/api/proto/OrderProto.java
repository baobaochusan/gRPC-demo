// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order.proto

package com.grpc.api.proto;

public final class OrderProto {
  private OrderProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Buyer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Buyer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Order_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Order_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013order.proto\"\030\n\005Buyer\022\017\n\007buyerId\030\001 \001(\005\"" +
      "S\n\005Order\022\017\n\007orderId\030\001 \001(\005\022\021\n\tproductId\030\002" +
      " \001(\005\022\021\n\torderTime\030\003 \001(\003\022\023\n\013buyerRemark\030\004" +
      " \001(\t25\n\021OrderQueryService\022 \n\nListOrders\022" +
      "\006.Buyer\032\006.Order\"\0000\001B\"\n\022com.grpc.api.prot" +
      "oB\nOrderProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Buyer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Buyer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Buyer_descriptor,
        new java.lang.String[] { "BuyerId", });
    internal_static_Order_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Order_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Order_descriptor,
        new java.lang.String[] { "OrderId", "ProductId", "OrderTime", "BuyerRemark", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
