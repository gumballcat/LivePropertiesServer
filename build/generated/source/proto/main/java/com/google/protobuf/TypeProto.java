// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/type.proto

package com.google.protobuf;

public final class TypeProto {
  private TypeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_protobuf_Type_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_protobuf_Type_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_protobuf_Field_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_protobuf_Field_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_protobuf_Enum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_protobuf_Enum_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_protobuf_EnumValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_protobuf_EnumValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_protobuf_Option_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_protobuf_Option_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032google/protobuf/type.proto\022\017google.pro" +
      "tobuf\032\031google/protobuf/any.proto\032$google" +
      "/protobuf/source_context.proto\"\327\001\n\004Type\022" +
      "\014\n\004name\030\001 \001(\t\022&\n\006fields\030\002 \003(\0132\026.google.p" +
      "rotobuf.Field\022\016\n\006oneofs\030\003 \003(\t\022(\n\007options" +
      "\030\004 \003(\0132\027.google.protobuf.Option\0226\n\016sourc" +
      "e_context\030\005 \001(\0132\036.google.protobuf.Source" +
      "Context\022\'\n\006syntax\030\006 \001(\0162\027.google.protobu" +
      "f.Syntax\"\325\005\n\005Field\022)\n\004kind\030\001 \001(\0162\033.googl" +
      "e.protobuf.Field.Kind\0227\n\013cardinality\030\002 \001" +
      "(\0162\".google.protobuf.Field.Cardinality\022\016" +
      "\n\006number\030\003 \001(\005\022\014\n\004name\030\004 \001(\t\022\020\n\010type_url" +
      "\030\006 \001(\t\022\023\n\013oneof_index\030\007 \001(\005\022\016\n\006packed\030\010 " +
      "\001(\010\022(\n\007options\030\t \003(\0132\027.google.protobuf.O" +
      "ption\022\021\n\tjson_name\030\n \001(\t\022\025\n\rdefault_valu" +
      "e\030\013 \001(\t\"\310\002\n\004Kind\022\020\n\014TYPE_UNKNOWN\020\000\022\017\n\013TY" +
      "PE_DOUBLE\020\001\022\016\n\nTYPE_FLOAT\020\002\022\016\n\nTYPE_INT6" +
      "4\020\003\022\017\n\013TYPE_UINT64\020\004\022\016\n\nTYPE_INT32\020\005\022\020\n\014" +
      "TYPE_FIXED64\020\006\022\020\n\014TYPE_FIXED32\020\007\022\r\n\tTYPE" +
      "_BOOL\020\010\022\017\n\013TYPE_STRING\020\t\022\016\n\nTYPE_GROUP\020\n" +
      "\022\020\n\014TYPE_MESSAGE\020\013\022\016\n\nTYPE_BYTES\020\014\022\017\n\013TY" +
      "PE_UINT32\020\r\022\r\n\tTYPE_ENUM\020\016\022\021\n\rTYPE_SFIXE" +
      "D32\020\017\022\021\n\rTYPE_SFIXED64\020\020\022\017\n\013TYPE_SINT32\020" +
      "\021\022\017\n\013TYPE_SINT64\020\022\"t\n\013Cardinality\022\027\n\023CAR" +
      "DINALITY_UNKNOWN\020\000\022\030\n\024CARDINALITY_OPTION" +
      "AL\020\001\022\030\n\024CARDINALITY_REQUIRED\020\002\022\030\n\024CARDIN" +
      "ALITY_REPEATED\020\003\"\316\001\n\004Enum\022\014\n\004name\030\001 \001(\t\022" +
      "-\n\tenumvalue\030\002 \003(\0132\032.google.protobuf.Enu" +
      "mValue\022(\n\007options\030\003 \003(\0132\027.google.protobu" +
      "f.Option\0226\n\016source_context\030\004 \001(\0132\036.googl" +
      "e.protobuf.SourceContext\022\'\n\006syntax\030\005 \001(\016" +
      "2\027.google.protobuf.Syntax\"S\n\tEnumValue\022\014" +
      "\n\004name\030\001 \001(\t\022\016\n\006number\030\002 \001(\005\022(\n\007options\030" +
      "\003 \003(\0132\027.google.protobuf.Option\";\n\006Option" +
      "\022\014\n\004name\030\001 \001(\t\022#\n\005value\030\002 \001(\0132\024.google.p" +
      "rotobuf.Any*.\n\006Syntax\022\021\n\rSYNTAX_PROTO2\020\000" +
      "\022\021\n\rSYNTAX_PROTO3\020\001B{\n\023com.google.protob" +
      "ufB\tTypeProtoP\001Z-google.golang.org/proto" +
      "buf/types/known/typepb\370\001\001\242\002\003GPB\252\002\036Google" +
      ".Protobuf.WellKnownTypesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.SourceContextProto.getDescriptor(),
        });
    internal_static_google_protobuf_Type_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_protobuf_Type_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_protobuf_Type_descriptor,
        new java.lang.String[] { "Name", "Fields", "Oneofs", "Options", "SourceContext", "Syntax", });
    internal_static_google_protobuf_Field_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_protobuf_Field_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_protobuf_Field_descriptor,
        new java.lang.String[] { "Kind", "Cardinality", "Number", "Name", "TypeUrl", "OneofIndex", "Packed", "Options", "JsonName", "DefaultValue", });
    internal_static_google_protobuf_Enum_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_protobuf_Enum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_protobuf_Enum_descriptor,
        new java.lang.String[] { "Name", "Enumvalue", "Options", "SourceContext", "Syntax", });
    internal_static_google_protobuf_EnumValue_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_protobuf_EnumValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_protobuf_EnumValue_descriptor,
        new java.lang.String[] { "Name", "Number", "Options", });
    internal_static_google_protobuf_Option_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_protobuf_Option_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_protobuf_Option_descriptor,
        new java.lang.String[] { "Name", "Value", });
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.SourceContextProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
