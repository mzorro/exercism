/**
  * Created On 05/18 2017
  *
  * @author hzpengjunjian@corp.netease.com
  */
case class Matrix(s: String) {
  private val mat: Array[Array[Int]] = s.split("\n").map(_.split("\\s+").map(_.toInt))
  val rows: Array[Vector[Int]] = mat.map(_.toVector)
  val cols: Array[Vector[Int]] =
    mat.head.indices.map(col => mat.indices.map(row => mat(row)(col)).toVector).toArray
}
