package cc.xmccc.hbase.util

object HBaseUtil {
  def getHexSplits(startKey: Array[Byte], endKey: Array[Byte], numRegions: Int): Array[Array[Byte]] = {
    val splits = new Array[Array[Byte]](numRegions - 1)
    var lowestKey = BigInt(startKey)
    val highestKey = BigInt(endKey)
    val range = highestKey - lowestKey
    val regionIncrement = range / numRegions
    lowestKey = lowestKey + regionIncrement
    var i = 0
    while ( {
      i < numRegions - 1
    }) {
      val key = lowestKey + (regionIncrement * i)
      val keyByte = key.toByteArray
      splits(i) = Array.fill(endKey.length - keyByte.length)(0.toByte) ++ keyByte

      {
        i += 1; i - 1
      }
    }
    splits
  }
}