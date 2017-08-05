
object Plant extends Enumeration {
  type Plant = Value
  val Violets, Clover, Radishes, Grass = Value
  def fromChar(c: Char): Plant = {
    c match {
      case 'V' => Violets
      case 'R' => Radishes
      case 'C' => Clover
      case 'G' => Grass
    }
  }
}

import Plant._

case class Garden(names: List[String], garden: String) {
  private val namesMap = names.sorted.zipWithIndex.toMap
  def getPlants(name: String): List[Plant] = {
    val Array(g1, g2) = garden.split("\n")
    val i = namesMap.getOrElse(name, -1)
    if (i < 0 || i * 2 > g1.length)
      List.empty[Plant]
    else
      List(
        Plant.fromChar(g1(i*2)),
        Plant.fromChar(g1(i*2+1)),
        Plant.fromChar(g2(i*2)),
        Plant.fromChar(g2(i*2+1))
      )
  }
}

object Garden {
  private val defaultNames = "Alice, Bob, Charlie, David, Eve, Fred, Ginny, Harriet, Ileana, Joseph, Kincaid, Larry".split(", ").toList
  def defaultGarden(garden: String): Garden = Garden(defaultNames, garden)
}

