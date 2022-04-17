// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityScalarType.proto

package emu.grasscutter.net.proto;

public final class AbilityScalarTypeOuterClass {
  private AbilityScalarTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code AbilityScalarType}
   */
  public enum AbilityScalarType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>Unknow = 0;</code>
     */
    Unknow(0),
    /**
     * <code>Float = 1;</code>
     */
    Float(1),
    /**
     * <code>Int = 2;</code>
     */
    Int(2),
    /**
     * <code>Bool = 3;</code>
     */
    Bool(3),
    /**
     * <code>Trigger = 4;</code>
     */
    Trigger(4),
    /**
     * <code>String = 5;</code>
     */
    String(5),
    /**
     * <code>Uint = 6;</code>
     */
    Uint(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>Unknow = 0;</code>
     */
    public static final int Unknow_VALUE = 0;
    /**
     * <code>Float = 1;</code>
     */
    public static final int Float_VALUE = 1;
    /**
     * <code>Int = 2;</code>
     */
    public static final int Int_VALUE = 2;
    /**
     * <code>Bool = 3;</code>
     */
    public static final int Bool_VALUE = 3;
    /**
     * <code>Trigger = 4;</code>
     */
    public static final int Trigger_VALUE = 4;
    /**
     * <code>String = 5;</code>
     */
    public static final int String_VALUE = 5;
    /**
     * <code>Uint = 6;</code>
     */
    public static final int Uint_VALUE = 6;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AbilityScalarType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AbilityScalarType forNumber(int value) {
      switch (value) {
        case 0: return Unknow;
        case 1: return Float;
        case 2: return Int;
        case 3: return Bool;
        case 4: return Trigger;
        case 5: return String;
        case 6: return Uint;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AbilityScalarType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AbilityScalarType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AbilityScalarType>() {
            public AbilityScalarType findValueByNumber(int number) {
              return AbilityScalarType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AbilityScalarTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final AbilityScalarType[] VALUES = values();

    public static AbilityScalarType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AbilityScalarType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:AbilityScalarType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027AbilityScalarType.proto*`\n\021AbilityScal" +
      "arType\022\n\n\006Unknow\020\000\022\t\n\005Float\020\001\022\007\n\003Int\020\002\022\010" +
      "\n\004Bool\020\003\022\013\n\007Trigger\020\004\022\n\n\006String\020\005\022\010\n\004Uin" +
      "t\020\006B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
