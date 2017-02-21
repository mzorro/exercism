/**
  * Created by mz on 2/21 021.
  */
object Hamming {
  def diff(d1: String, d2: String): Int = {
    d1.zip(d2).map { case (c1, c2) => if (c1 == c2) 0 else 1 }.sum
  }

  def compute(d1: String, d2: String): Option[Int] = {
    if (d1.length != d2.length)
      None
    else
      Some(diff(d1, d2))
  }
}
