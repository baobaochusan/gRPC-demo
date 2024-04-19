// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order.proto

package com.grpc.api.proto;

/**
 * Protobuf type {@code Order}
 */
public final class Order extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Order)
    OrderOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Order.newBuilder() to construct.
  private Order(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Order() {
    buyerRemark_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Order();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.grpc.api.proto.OrderProto.internal_static_Order_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.api.proto.OrderProto.internal_static_Order_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.api.proto.Order.class, com.grpc.api.proto.Order.Builder.class);
  }

  public static final int ORDERID_FIELD_NUMBER = 1;
  private int orderId_;
  /**
   * <code>int32 orderId = 1;</code>
   * @return The orderId.
   */
  @java.lang.Override
  public int getOrderId() {
    return orderId_;
  }

  public static final int PRODUCTID_FIELD_NUMBER = 2;
  private int productId_;
  /**
   * <code>int32 productId = 2;</code>
   * @return The productId.
   */
  @java.lang.Override
  public int getProductId() {
    return productId_;
  }

  public static final int ORDERTIME_FIELD_NUMBER = 3;
  private long orderTime_;
  /**
   * <code>int64 orderTime = 3;</code>
   * @return The orderTime.
   */
  @java.lang.Override
  public long getOrderTime() {
    return orderTime_;
  }

  public static final int BUYERREMARK_FIELD_NUMBER = 4;
  private volatile java.lang.Object buyerRemark_;
  /**
   * <code>string buyerRemark = 4;</code>
   * @return The buyerRemark.
   */
  @java.lang.Override
  public java.lang.String getBuyerRemark() {
    java.lang.Object ref = buyerRemark_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      buyerRemark_ = s;
      return s;
    }
  }
  /**
   * <code>string buyerRemark = 4;</code>
   * @return The bytes for buyerRemark.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBuyerRemarkBytes() {
    java.lang.Object ref = buyerRemark_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      buyerRemark_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (orderId_ != 0) {
      output.writeInt32(1, orderId_);
    }
    if (productId_ != 0) {
      output.writeInt32(2, productId_);
    }
    if (orderTime_ != 0L) {
      output.writeInt64(3, orderTime_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(buyerRemark_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, buyerRemark_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (orderId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, orderId_);
    }
    if (productId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, productId_);
    }
    if (orderTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, orderTime_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(buyerRemark_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, buyerRemark_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.grpc.api.proto.Order)) {
      return super.equals(obj);
    }
    com.grpc.api.proto.Order other = (com.grpc.api.proto.Order) obj;

    if (getOrderId()
        != other.getOrderId()) return false;
    if (getProductId()
        != other.getProductId()) return false;
    if (getOrderTime()
        != other.getOrderTime()) return false;
    if (!getBuyerRemark()
        .equals(other.getBuyerRemark())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ORDERID_FIELD_NUMBER;
    hash = (53 * hash) + getOrderId();
    hash = (37 * hash) + PRODUCTID_FIELD_NUMBER;
    hash = (53 * hash) + getProductId();
    hash = (37 * hash) + ORDERTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOrderTime());
    hash = (37 * hash) + BUYERREMARK_FIELD_NUMBER;
    hash = (53 * hash) + getBuyerRemark().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.api.proto.Order parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.api.proto.Order parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.api.proto.Order parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.api.proto.Order parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.api.proto.Order parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.api.proto.Order parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.api.proto.Order parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.api.proto.Order parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.api.proto.Order parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpc.api.proto.Order parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.api.proto.Order parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.api.proto.Order parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.grpc.api.proto.Order prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Order}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Order)
      com.grpc.api.proto.OrderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.api.proto.OrderProto.internal_static_Order_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.api.proto.OrderProto.internal_static_Order_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.api.proto.Order.class, com.grpc.api.proto.Order.Builder.class);
    }

    // Construct using com.grpc.api.proto.Order.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      orderId_ = 0;

      productId_ = 0;

      orderTime_ = 0L;

      buyerRemark_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.api.proto.OrderProto.internal_static_Order_descriptor;
    }

    @java.lang.Override
    public com.grpc.api.proto.Order getDefaultInstanceForType() {
      return com.grpc.api.proto.Order.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpc.api.proto.Order build() {
      com.grpc.api.proto.Order result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpc.api.proto.Order buildPartial() {
      com.grpc.api.proto.Order result = new com.grpc.api.proto.Order(this);
      result.orderId_ = orderId_;
      result.productId_ = productId_;
      result.orderTime_ = orderTime_;
      result.buyerRemark_ = buyerRemark_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.grpc.api.proto.Order) {
        return mergeFrom((com.grpc.api.proto.Order)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.api.proto.Order other) {
      if (other == com.grpc.api.proto.Order.getDefaultInstance()) return this;
      if (other.getOrderId() != 0) {
        setOrderId(other.getOrderId());
      }
      if (other.getProductId() != 0) {
        setProductId(other.getProductId());
      }
      if (other.getOrderTime() != 0L) {
        setOrderTime(other.getOrderTime());
      }
      if (!other.getBuyerRemark().isEmpty()) {
        buyerRemark_ = other.buyerRemark_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              orderId_ = input.readInt32();

              break;
            } // case 8
            case 16: {
              productId_ = input.readInt32();

              break;
            } // case 16
            case 24: {
              orderTime_ = input.readInt64();

              break;
            } // case 24
            case 34: {
              buyerRemark_ = input.readStringRequireUtf8();

              break;
            } // case 34
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int orderId_ ;
    /**
     * <code>int32 orderId = 1;</code>
     * @return The orderId.
     */
    @java.lang.Override
    public int getOrderId() {
      return orderId_;
    }
    /**
     * <code>int32 orderId = 1;</code>
     * @param value The orderId to set.
     * @return This builder for chaining.
     */
    public Builder setOrderId(int value) {
      
      orderId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 orderId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrderId() {
      
      orderId_ = 0;
      onChanged();
      return this;
    }

    private int productId_ ;
    /**
     * <code>int32 productId = 2;</code>
     * @return The productId.
     */
    @java.lang.Override
    public int getProductId() {
      return productId_;
    }
    /**
     * <code>int32 productId = 2;</code>
     * @param value The productId to set.
     * @return This builder for chaining.
     */
    public Builder setProductId(int value) {
      
      productId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 productId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearProductId() {
      
      productId_ = 0;
      onChanged();
      return this;
    }

    private long orderTime_ ;
    /**
     * <code>int64 orderTime = 3;</code>
     * @return The orderTime.
     */
    @java.lang.Override
    public long getOrderTime() {
      return orderTime_;
    }
    /**
     * <code>int64 orderTime = 3;</code>
     * @param value The orderTime to set.
     * @return This builder for chaining.
     */
    public Builder setOrderTime(long value) {
      
      orderTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 orderTime = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrderTime() {
      
      orderTime_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object buyerRemark_ = "";
    /**
     * <code>string buyerRemark = 4;</code>
     * @return The buyerRemark.
     */
    public java.lang.String getBuyerRemark() {
      java.lang.Object ref = buyerRemark_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        buyerRemark_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string buyerRemark = 4;</code>
     * @return The bytes for buyerRemark.
     */
    public com.google.protobuf.ByteString
        getBuyerRemarkBytes() {
      java.lang.Object ref = buyerRemark_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        buyerRemark_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string buyerRemark = 4;</code>
     * @param value The buyerRemark to set.
     * @return This builder for chaining.
     */
    public Builder setBuyerRemark(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      buyerRemark_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string buyerRemark = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBuyerRemark() {
      
      buyerRemark_ = getDefaultInstance().getBuyerRemark();
      onChanged();
      return this;
    }
    /**
     * <code>string buyerRemark = 4;</code>
     * @param value The bytes for buyerRemark to set.
     * @return This builder for chaining.
     */
    public Builder setBuyerRemarkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      buyerRemark_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Order)
  }

  // @@protoc_insertion_point(class_scope:Order)
  private static final com.grpc.api.proto.Order DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.api.proto.Order();
  }

  public static com.grpc.api.proto.Order getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Order>
      PARSER = new com.google.protobuf.AbstractParser<Order>() {
    @java.lang.Override
    public Order parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Order> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Order> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpc.api.proto.Order getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

