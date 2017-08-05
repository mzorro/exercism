object Series {
  def largestProduct(n: Int, seq: String): Option[Int] = {
    if (n < 0 || n > seq.length) None
    else if (n == 0) Some(1)
    else if (seq.exists(!_.isDigit)) None
    else Some(seq.map(_.toString.toInt).sliding(n).map(_.product).max)
  }
}