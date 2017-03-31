/**
  * Created by mz on 3/31 031.
  */
object Dna {
  val dna2RnaMap: Map[Char, Char] =
    Map('G' -> 'C', 'C' -> 'G', 'T' -> 'A', 'A' -> 'U')

  def toRna(s: String): Option[String] = {
    val result = s.flatMap(dna2RnaMap.get)
    if (result.length == s.length)
      Some(result)
    else
      None
  }
}
