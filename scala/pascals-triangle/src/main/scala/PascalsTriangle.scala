object PascalsTriangle {
  def rows(n: Int): List[List[Int]] = {
    lazy val l = rows(n-1)
    if (n <= 0) List.empty
    else if (n == 1) List(List(1))
    else l ::: List((0 :: l.last :::List(0)).sliding(2).map(_.sum).toList)
  }
}
