object SumOfMultiples {
  def sumOfMultiples(factors: Set[Int], limit: Int): Int = {
    factors.flatMap(factor => {
      val n = (limit - 1) / factor
      (1 to n).map(_ * factor)
    }).sum
  }
}

