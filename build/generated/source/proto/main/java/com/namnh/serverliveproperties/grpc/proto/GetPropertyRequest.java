// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live-properties-server.proto

package com.namnh.serverliveproperties.grpc.proto;

/**
 * Protobuf type {@code GetPropertyRequest}
 */
public final class GetPropertyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetPropertyRequest)
    GetPropertyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetPropertyRequest.newBuilder() to construct.
  private GetPropertyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetPropertyRequest() {
    propertyName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetPropertyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.namnh.serverliveproperties.grpc.proto.LivePropertiesServerProto.internal_static_GetPropertyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.namnh.serverliveproperties.grpc.proto.LivePropertiesServerProto.internal_static_GetPropertyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest.class, com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest.Builder.class);
  }

  private int bitField0_;
  public static final int SERVICEID_FIELD_NUMBER = 1;
  private com.namnh.serverliveproperties.grpc.proto.GServiceID serviceID_;
  /**
   * <code>optional .GServiceID serviceID = 1;</code>
   * @return Whether the serviceID field is set.
   */
  @java.lang.Override
  public boolean hasServiceID() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .GServiceID serviceID = 1;</code>
   * @return The serviceID.
   */
  @java.lang.Override
  public com.namnh.serverliveproperties.grpc.proto.GServiceID getServiceID() {
    return serviceID_ == null ? com.namnh.serverliveproperties.grpc.proto.GServiceID.getDefaultInstance() : serviceID_;
  }
  /**
   * <code>optional .GServiceID serviceID = 1;</code>
   */
  @java.lang.Override
  public com.namnh.serverliveproperties.grpc.proto.GServiceIDOrBuilder getServiceIDOrBuilder() {
    return serviceID_ == null ? com.namnh.serverliveproperties.grpc.proto.GServiceID.getDefaultInstance() : serviceID_;
  }

  public static final int PROPERTYNAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object propertyName_ = "";
  /**
   * <code>optional string propertyName = 2;</code>
   * @return Whether the propertyName field is set.
   */
  @java.lang.Override
  public boolean hasPropertyName() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional string propertyName = 2;</code>
   * @return The propertyName.
   */
  @java.lang.Override
  public java.lang.String getPropertyName() {
    java.lang.Object ref = propertyName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      propertyName_ = s;
      return s;
    }
  }
  /**
   * <code>optional string propertyName = 2;</code>
   * @return The bytes for propertyName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPropertyNameBytes() {
    java.lang.Object ref = propertyName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      propertyName_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getServiceID());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, propertyName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getServiceID());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, propertyName_);
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
    if (!(obj instanceof com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest)) {
      return super.equals(obj);
    }
    com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest other = (com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest) obj;

    if (hasServiceID() != other.hasServiceID()) return false;
    if (hasServiceID()) {
      if (!getServiceID()
          .equals(other.getServiceID())) return false;
    }
    if (hasPropertyName() != other.hasPropertyName()) return false;
    if (hasPropertyName()) {
      if (!getPropertyName()
          .equals(other.getPropertyName())) return false;
    }
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
    if (hasServiceID()) {
      hash = (37 * hash) + SERVICEID_FIELD_NUMBER;
      hash = (53 * hash) + getServiceID().hashCode();
    }
    if (hasPropertyName()) {
      hash = (37 * hash) + PROPERTYNAME_FIELD_NUMBER;
      hash = (53 * hash) + getPropertyName().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest parseFrom(
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
  public static Builder newBuilder(com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest prototype) {
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
   * Protobuf type {@code GetPropertyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetPropertyRequest)
      com.namnh.serverliveproperties.grpc.proto.GetPropertyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.namnh.serverliveproperties.grpc.proto.LivePropertiesServerProto.internal_static_GetPropertyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.namnh.serverliveproperties.grpc.proto.LivePropertiesServerProto.internal_static_GetPropertyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest.class, com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest.Builder.class);
    }

    // Construct using com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getServiceIDFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      serviceID_ = null;
      if (serviceIDBuilder_ != null) {
        serviceIDBuilder_.dispose();
        serviceIDBuilder_ = null;
      }
      propertyName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.namnh.serverliveproperties.grpc.proto.LivePropertiesServerProto.internal_static_GetPropertyRequest_descriptor;
    }

    @java.lang.Override
    public com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest getDefaultInstanceForType() {
      return com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest build() {
      com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest buildPartial() {
      com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest result = new com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.serviceID_ = serviceIDBuilder_ == null
            ? serviceID_
            : serviceIDBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.propertyName_ = propertyName_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest) {
        return mergeFrom((com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest other) {
      if (other == com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest.getDefaultInstance()) return this;
      if (other.hasServiceID()) {
        mergeServiceID(other.getServiceID());
      }
      if (other.hasPropertyName()) {
        propertyName_ = other.propertyName_;
        bitField0_ |= 0x00000002;
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
            case 10: {
              input.readMessage(
                  getServiceIDFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              propertyName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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
    private int bitField0_;

    private com.namnh.serverliveproperties.grpc.proto.GServiceID serviceID_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.namnh.serverliveproperties.grpc.proto.GServiceID, com.namnh.serverliveproperties.grpc.proto.GServiceID.Builder, com.namnh.serverliveproperties.grpc.proto.GServiceIDOrBuilder> serviceIDBuilder_;
    /**
     * <code>optional .GServiceID serviceID = 1;</code>
     * @return Whether the serviceID field is set.
     */
    public boolean hasServiceID() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .GServiceID serviceID = 1;</code>
     * @return The serviceID.
     */
    public com.namnh.serverliveproperties.grpc.proto.GServiceID getServiceID() {
      if (serviceIDBuilder_ == null) {
        return serviceID_ == null ? com.namnh.serverliveproperties.grpc.proto.GServiceID.getDefaultInstance() : serviceID_;
      } else {
        return serviceIDBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .GServiceID serviceID = 1;</code>
     */
    public Builder setServiceID(com.namnh.serverliveproperties.grpc.proto.GServiceID value) {
      if (serviceIDBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        serviceID_ = value;
      } else {
        serviceIDBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .GServiceID serviceID = 1;</code>
     */
    public Builder setServiceID(
        com.namnh.serverliveproperties.grpc.proto.GServiceID.Builder builderForValue) {
      if (serviceIDBuilder_ == null) {
        serviceID_ = builderForValue.build();
      } else {
        serviceIDBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .GServiceID serviceID = 1;</code>
     */
    public Builder mergeServiceID(com.namnh.serverliveproperties.grpc.proto.GServiceID value) {
      if (serviceIDBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          serviceID_ != null &&
          serviceID_ != com.namnh.serverliveproperties.grpc.proto.GServiceID.getDefaultInstance()) {
          getServiceIDBuilder().mergeFrom(value);
        } else {
          serviceID_ = value;
        }
      } else {
        serviceIDBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .GServiceID serviceID = 1;</code>
     */
    public Builder clearServiceID() {
      bitField0_ = (bitField0_ & ~0x00000001);
      serviceID_ = null;
      if (serviceIDBuilder_ != null) {
        serviceIDBuilder_.dispose();
        serviceIDBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .GServiceID serviceID = 1;</code>
     */
    public com.namnh.serverliveproperties.grpc.proto.GServiceID.Builder getServiceIDBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getServiceIDFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .GServiceID serviceID = 1;</code>
     */
    public com.namnh.serverliveproperties.grpc.proto.GServiceIDOrBuilder getServiceIDOrBuilder() {
      if (serviceIDBuilder_ != null) {
        return serviceIDBuilder_.getMessageOrBuilder();
      } else {
        return serviceID_ == null ?
            com.namnh.serverliveproperties.grpc.proto.GServiceID.getDefaultInstance() : serviceID_;
      }
    }
    /**
     * <code>optional .GServiceID serviceID = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.namnh.serverliveproperties.grpc.proto.GServiceID, com.namnh.serverliveproperties.grpc.proto.GServiceID.Builder, com.namnh.serverliveproperties.grpc.proto.GServiceIDOrBuilder> 
        getServiceIDFieldBuilder() {
      if (serviceIDBuilder_ == null) {
        serviceIDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.namnh.serverliveproperties.grpc.proto.GServiceID, com.namnh.serverliveproperties.grpc.proto.GServiceID.Builder, com.namnh.serverliveproperties.grpc.proto.GServiceIDOrBuilder>(
                getServiceID(),
                getParentForChildren(),
                isClean());
        serviceID_ = null;
      }
      return serviceIDBuilder_;
    }

    private java.lang.Object propertyName_ = "";
    /**
     * <code>optional string propertyName = 2;</code>
     * @return Whether the propertyName field is set.
     */
    public boolean hasPropertyName() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string propertyName = 2;</code>
     * @return The propertyName.
     */
    public java.lang.String getPropertyName() {
      java.lang.Object ref = propertyName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        propertyName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string propertyName = 2;</code>
     * @return The bytes for propertyName.
     */
    public com.google.protobuf.ByteString
        getPropertyNameBytes() {
      java.lang.Object ref = propertyName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        propertyName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string propertyName = 2;</code>
     * @param value The propertyName to set.
     * @return This builder for chaining.
     */
    public Builder setPropertyName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      propertyName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional string propertyName = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPropertyName() {
      propertyName_ = getDefaultInstance().getPropertyName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>optional string propertyName = 2;</code>
     * @param value The bytes for propertyName to set.
     * @return This builder for chaining.
     */
    public Builder setPropertyNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      propertyName_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:GetPropertyRequest)
  }

  // @@protoc_insertion_point(class_scope:GetPropertyRequest)
  private static final com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest();
  }

  public static com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetPropertyRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetPropertyRequest>() {
    @java.lang.Override
    public GetPropertyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetPropertyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetPropertyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.namnh.serverliveproperties.grpc.proto.GetPropertyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

