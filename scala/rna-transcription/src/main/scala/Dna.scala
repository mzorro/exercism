

/**
  * Created by mz on 3/31 031.
  */
object Dna {
  val dna2RnaMap: Map[Char, Char] =
    Map('G' -> 'C', 'C' -> 'G', 'T' -> 'A', 'A' -> 'U')

  def toRna(s: String): Option[String] = {
    s.foldLeft(Option(""))((ops, c) => ops.flatMap(s => dna2RnaMap.get(c).map(s + _)))
  }
}