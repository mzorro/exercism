/**
  * Created On 06/09 2017
  *
  * @author hzpengjunjian@corp.netease.com
  */
object AllYourBase {
  def rebase(fromBase: Int, numbers: List[Int], toBase: Int): Option[List[Int]] = {
    if (numbers.exists(n => n >= fromBase || n < 0) || fromBase <= 1 || toBase <= 1)
      None
    else {
      var result = List.empty[Int]
      if (numbers.nonEmpty) {
        var v = numbers.reduce(_ * fromBase + _)
        while (v > 0) {
          result = (v % toBase) +: result
          v /= toBase
        }
      }
      Some(result)
    }
  }
}
