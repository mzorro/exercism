sealed class NumberType

object NumberType {
  object Perfect extends NumberType
  object Abundant extends NumberType
  object Deficient extends NumberType
}

object PerfectNumbers {

  def classify(n: Int): NumberType = {
    val sumOfFactors = (1 to n/2).filter(n % _ == 0).sum
    if (sumOfFactors > n)
      NumberType.Abundant
    else if (sumOfFactors == n)
      NumberType.Perfect
    else
      NumberType.Deficient
  }
}