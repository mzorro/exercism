/**
  * Created On 05/23 2017
  *
  * @author hzpengjunjian@corp.netease.com
  */
object Series {
  def slices(n: Int, s: String): List[List[Int]] = {
    if (n > s.length) return List()
    (0 until s.length - n + 1).map { i =>
      s.substring(i, i + n).toList.map(_.toString.toInt)
    }.toList
  }
}
