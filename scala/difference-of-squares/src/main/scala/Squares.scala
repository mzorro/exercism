/**
  * Created by mz on 3/22 022.
  */
object Squares {
  def square(n: Int): Int = n * n
  def squareOfSums(n: Int): Int = square((1 to n).sum)
  def sumOfSquares(n: Int): Int = (1 to n).map(square).sum

  def difference(n: Int): Int = squareOfSums(n) - sumOfSquares(n)
}
