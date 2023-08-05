package testgen.enums

import kotlin.Int
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@Serializable
public data class MessageWithEnum(
  @ProtoNumber(number = 1)
  public val id: Int = 0,
  @ProtoNumber(number = 2)
  public val testEnum: TestEnum = testgen.enums.TestEnum.FOO,
  @ProtoNumber(number = 3)
  public val aliasedEnum: AliasedEnum = testgen.enums.AliasedEnum.ALIAS_FOO,
  @ProtoNumber(number = 4)
  public val nestedEnum: NestedEnum = testgen.enums.MessageWithEnum.NestedEnum.NESTED_FOO,
) {
  public enum class NestedEnum {
    @ProtoNumber(number = 0)
    NESTED_FOO,
    @ProtoNumber(number = 1)
    NESTED_BAR,
    @ProtoNumber(number = 2)
    NESTED_BAZ,
  }
}

public enum class TestEnum {
  @ProtoNumber(number = 0)
  FOO,
  @ProtoNumber(number = 1)
  BAR,
  @ProtoNumber(number = 2)
  BAZ,
  @ProtoNumber(number = 100)
  TOP,
  @ProtoNumber(number = -1)
  NEG,
}

public enum class AliasedEnum {
  @ProtoNumber(number = 0)
  ALIAS_FOO,
  @ProtoNumber(number = 1)
  ALIAS_BAR,
  @ProtoNumber(number = 2)
  ALIAS_BAZ,
  @ProtoNumber(number = 2)
  QUX,
  @ProtoNumber(number = 2)
  qux,
  @ProtoNumber(number = 2)
  bAz,
}
