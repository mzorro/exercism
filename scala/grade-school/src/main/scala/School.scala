import scala.collection.immutable.ListMap

/**
  * Created by mz on 2/23 023.
  */
class School {
  var db: Map[Int, List[String]] = Map()

  def add(name: String, grade: Int) =
    db += (grade -> (db.getOrElse(grade, List.empty[String]) ::: List(name)))

  def grade(g: Int): List[String] =
    db.getOrElse(g, List.empty[String])

  def sorted: Map[Int, List[String]] =
    ListMap(db.mapValues(_.sorted).toSeq.sortBy(_._1): _*)
}
