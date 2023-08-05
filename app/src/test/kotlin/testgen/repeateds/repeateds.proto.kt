package testgen.repeateds

import kotlin.Boolean
import kotlin.ByteArray
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.UInt
import kotlin.ULong
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@Serializable
public data class RepeatedsMessage(
  @ProtoNumber(number = 1)
  public val repeatedInt32: List<Int> = listOf(),
  @ProtoNumber(number = 2)
  public val repeatedInt64: List<Long> = listOf(),
  @ProtoNumber(number = 3)
  public val repeatedUint32: List<UInt> = listOf(),
  @ProtoNumber(number = 4)
  public val repeatedUint64: List<ULong> = listOf(),
  @ProtoNumber(number = 5)
  public val repeatedSint32: List<Int> = listOf(),
  @ProtoNumber(number = 6)
  public val repeatedSint64: List<Long> = listOf(),
  @ProtoNumber(number = 7)
  public val repeatedFixed32: List<Int> = listOf(),
  @ProtoNumber(number = 8)
  public val repeatedFixed64: List<Long> = listOf(),
  @ProtoNumber(number = 9)
  public val repeatedSfixed32: List<Int> = listOf(),
  @ProtoNumber(number = 10)
  public val repeatedSfixed64: List<Long> = listOf(),
  @ProtoNumber(number = 11)
  public val repeatedFloat: List<Float> = listOf(),
  @ProtoNumber(number = 12)
  public val repeatedDouble: List<Double> = listOf(),
  @ProtoNumber(number = 13)
  public val repeatedBool: List<Boolean> = listOf(),
  @ProtoNumber(number = 14)
  public val repeatedString: List<String> = listOf(),
  @ProtoNumber(number = 15)
  public val repeatedBytes: List<ByteArray> = listOf(),
  @ProtoNumber(number = 16)
  public val repeatedNestedMessage: List<NestedMessage?> = listOf(),
  @ProtoNumber(number = 17)
  public val repeatedForeignMessage: List<ForeignMessage?> = listOf(),
  @ProtoNumber(number = 18)
  public val repeatedNestedEnum: List<NestedEnum> = listOf(),
  @ProtoNumber(number = 19)
  public val repeatedForeignEnum: List<ForeignEnum> = listOf(),
) {
  @Serializable
  public data class NestedMessage(
    @ProtoNumber(number = 1)
    public val a: Int = 0,
    @ProtoNumber(number = 2)
    public val corecursive: RepeatedsMessage? = null,
  )

  public enum class NestedEnum {
    @ProtoNumber(number = 0)
    FOO,
    @ProtoNumber(number = 1)
    BAR,
    @ProtoNumber(number = 2)
    BAZ,
    @ProtoNumber(number = -1)
    NEG,
  }
}

@Serializable
public data class ForeignMessage(
  @ProtoNumber(number = 1)
  public val c: Int = 0,
)

public enum class ForeignEnum {
  @ProtoNumber(number = 0)
  FOREIGN_FOO,
  @ProtoNumber(number = 1)
  FOREIGN_BAR,
  @ProtoNumber(number = 2)
  FOREIGN_BAZ,
}
