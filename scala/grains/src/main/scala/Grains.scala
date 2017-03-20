/**
  * Created by mz on 3/18 018.
  */
object Grains {
  def square(n: Int): Option[BigInt] =
    if (n >= 1 && n <= 64)
      Some(BigInt(1) << (n-1))
    else
      None

  // val total: BigInt = (BigInt(1) << 64) - 1

  // for fun
  // val total: BigInt = (square(64).get << 1) - 1
  val total: BigInt = (1 to 64).flatMap(square).sum
}
