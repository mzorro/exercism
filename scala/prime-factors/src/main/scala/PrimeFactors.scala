import scala.collection.mutable.ArrayBuffer

/**
  * Created On 05/31 2017
  *
  * @author hzpengjunjian@corp.netease.com
  */
object PrimeFactors {

  /**
    * infinite (use with toStream)
    * cache with ArrayBuffer
    */
  object InfinitePrimes extends Iterable[Long] {

    private val cache = ArrayBuffer[Long](2, 3)

    override def iterator: Iterator[Long] = new Iterator[Long] {

      private var index = 0

      override def hasNext: Boolean = true

      override def next(): Long = {
        if (index >= cache.length)
          resizeCache(cache.length * 2)
        val next = cache(index)
        index += 1
        next
      }
    }

    private def resizeCache(resize: Int): Unit = {
      cache.sizeHint(resize)
      for (i <- cache.length until resize)
        cache += nextPrime(cache(i-1))
    }

    private def isPrime(n: Long): Boolean = !3L.to(math.pow(n, 0.5).floor.toLong, 2L).exists(n % _ == 0)

    private def nextPrime(n: Long): Long = {
      var next = n + 2L
      while (!isPrime(next)) next += 2L
      next
    }
  }

  def forNumber(n: Long): List[Long] = {
    var rest = n
    InfinitePrimes.toStream.takeWhile(_ => rest > 1).flatMap(next => {
      var buffer = ArrayBuffer[Long]()
      while (rest % next == 0) {
        rest /= next
        buffer += next
      }
      buffer
    }).toList
  }
}
