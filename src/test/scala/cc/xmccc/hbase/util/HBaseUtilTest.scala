package cc.xmccc.hbase.util

import org.apache.hadoop.hbase.util.Bytes
import org.scalatest.{FlatSpec, Matchers}

class HBaseUtilTest extends FlatSpec with Matchers {
  "hbase util" should "split rowkey correctly" in {
    val startkey = Bytes toBytes (0.toLong)
    val endkey = Bytes toBytes (120.toLong)
    val result = HBaseUtil.getHexSplits(startkey, endkey, 4)

    assert(result.length == 3)
    assert(result(0) sameElements Bytes.toBytes(30.toLong))
    assert(result(1) sameElements Bytes.toBytes(60.toLong))
    assert(result(2) sameElements Bytes.toBytes(90.toLong))
  }
}
