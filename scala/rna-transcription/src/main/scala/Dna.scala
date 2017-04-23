import scala.util.Try

/**
  * Created by mz on 3/31 031.
  */
object Dna {
  val dna2RnaMap: Map[Char, Char] =
    Map('G' -> 'C', 'C' -> 'G', 'T' -> 'A', 'A' -> 'U')

  def toRna(s: String): Option[String] = {
    val result = s.foldLeft(StringBuilder.newBuilder)((sb, c) => sb.append(dna2RnaMap.getOrElse(c, "")))
    Try(result.substring(0, s.length)).toOption
  }
}