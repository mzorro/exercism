/**
  * Created On 08/11 2017
  *
  * @author hzpengjunjian@corp.netease.com
  */
object PythagoreanTriplet {
  def isPythagorean(c: (Int, Int, Int)): Boolean = {
    val a = c.productIterator.asInstanceOf[Iterator[Int]].toArray.sorted.map(i => i * i)
    a(0) + a(1) == a(2)
  }

  def pythagoreanTriplets(l: Int, r: Int): List[(Int, Int, Int)] =
    (l to r).combinations(3).map(c => (c(0), c(1), c(2))).filter(isPythagorean).toList
}
