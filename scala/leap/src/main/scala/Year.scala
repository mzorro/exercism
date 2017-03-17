/**
  * Created by mz on 2/26 026.
  */
case class Year(n: Int) {
  def divisibleBy(m: Int): Boolean = n % m == 0
  def isLeap: Boolean = divisibleBy(400) || (divisibleBy(4) && !divisibleBy(100))
}
