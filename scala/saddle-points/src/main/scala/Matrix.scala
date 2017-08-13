/**
  * Created On 08/12 2017
  *
  * @author hzpengjunjian@corp.netease.com
  */
case class Matrix(mat: List[List[Int]]) {
  val saddlePoints: Set[(Int, Int)] = {
    val a = mat.toArray.map(_.toArray)
    val rowMax = a.map(_.max)
    val colMin = a.transpose.map(_.min)
    a.map(_.zipWithIndex).zipWithIndex
      .flatMap(i => i._1.map(k => (i._2, k._2, k._1)))
      .filter { case (m, n, x) => rowMax(m) == x && colMin(n) == x }
      .map(k => (k._1, k._2)).toSet
  }
}
