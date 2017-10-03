object BookStore {
  def total(books: List[Int]): Double = {
    val p = Map(1 -> 8.0, 2 -> 2 * 8 * 0.95, 3 -> 3 * 8 * 0.90, 4 -> 4 * 8 * 0.80, 5 -> 5 * 8 * 0.75)

    def f(bn: List[Int]): Double = if (bn.isEmpty) 0.0 else
      (1 to bn.size).map(n => p(n) + f(bn.take(n).map(_ - 1).filter(_ > 0) ++ bn.drop(n))).min

    f(books.groupBy(identity).map(_._2.size).toList.sorted.reverse)
  }
}
