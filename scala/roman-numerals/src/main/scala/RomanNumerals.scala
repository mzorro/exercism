/**
  * Created On 08/19 2017
  *
  * @author hzpengjunjian@corp.netease.com
  */
object RomanNumerals {
  def roman(n: Int): String = n.toString.reverse.zipWithIndex.map(p => roman(p._1 - '0', p._2)).reverse.mkString

  private val m = Map(0 -> ("I", "V", "X"), 1 -> ("X", "L", "C"), 2 -> ("C", "D", "M"), 3 -> ("M", "", ""))

  private def roman(n: Int, i: Int): String = {
    val (e1, e2, e3) = m(i)
    if (n <= 0) ""
    else if (n <= 3) e1 * n
    else if (n == 4) e1 + e2
    else if (n == 5) e2
    else if (n <= 8) e2 + e1 * (n - 5)
    else if (n == 9) e1 + e3
    else ""
  }
}
