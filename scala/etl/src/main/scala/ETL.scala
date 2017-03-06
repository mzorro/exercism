/**
  * Created by mz on 3/6 006.
  */
object ETL {
  def transform(old: Map[Int, Seq[String]]): Map[String, Int] =
    old.flatMap{ case (i, ss) => ss.map(_.toLowerCase -> i) }
}
