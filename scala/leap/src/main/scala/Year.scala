/**
  * Created by mz on 2/26 026.
  */
case class Year(n: Int) {
  def isLeap: Boolean =
    (n % 400 == 0) || ((n % 4 == 0) && (n % 100 != 0))
}
