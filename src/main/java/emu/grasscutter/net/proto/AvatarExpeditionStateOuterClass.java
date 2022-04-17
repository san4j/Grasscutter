// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarExpeditionState.proto

package emu.grasscutter.net.proto;

public final class AvatarExpeditionStateOuterClass {
  private AvatarExpeditionStateOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code AvatarExpeditionState}
   */
  public enum AvatarExpeditionState
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>AvatarExpeditionNone = 0;</code>
     */
    AvatarExpeditionNone(0),
    /**
     * <code>AvatarExpeditionDoing = 1;</code>
     */
    AvatarExpeditionDoing(1),
    /**
     * <code>AvatarExpeditionFinishWaitReward = 2;</code>
     */
    AvatarExpeditionFinishWaitReward(2),
    /**
     * <code>AvatarExpeditionCallbackWaitReward = 3;</code>
     */
    AvatarExpeditionCallbackWaitReward(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>AvatarExpeditionNone = 0;</code>
     */
    public static final int AvatarExpeditionNone_VALUE = 0;
    /**
     * <code>AvatarExpeditionDoing = 1;</code>
     */
    public static final int AvatarExpeditionDoing_VALUE = 1;
    /**
     * <code>AvatarExpeditionFinishWaitReward = 2;</code>
     */
    public static final int AvatarExpeditionFinishWaitReward_VALUE = 2;
    /**
     * <code>AvatarExpeditionCallbackWaitReward = 3;</code>
     */
    public static final int AvatarExpeditionCallbackWaitReward_VALUE = 3;


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
    public static AvatarExpeditionState valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AvatarExpeditionState forNumber(int value) {
      switch (value) {
        case 0: return AvatarExpeditionNone;
        case 1: return AvatarExpeditionDoing;
        case 2: return AvatarExpeditionFinishWaitReward;
        case 3: return AvatarExpeditionCallbackWaitReward;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AvatarExpeditionState>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AvatarExpeditionState> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AvatarExpeditionState>() {
            public AvatarExpeditionState findValueByNumber(int number) {
              return AvatarExpeditionState.forNumber(number);
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
      return emu.grasscutter.net.proto.AvatarExpeditionStateOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final AvatarExpeditionState[] VALUES = values();

    public static AvatarExpeditionState valueOf(
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

    private AvatarExpeditionState(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:AvatarExpeditionState)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033AvatarExpeditionState.proto*\232\001\n\025Avatar" +
      "ExpeditionState\022\030\n\024AvatarExpeditionNone\020" +
      "\000\022\031\n\025AvatarExpeditionDoing\020\001\022$\n AvatarEx" +
      "peditionFinishWaitReward\020\002\022&\n\"AvatarExpe" +
      "ditionCallbackWaitReward\020\003B\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
