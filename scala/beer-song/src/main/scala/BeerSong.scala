/**
  * Created On 05/29 2017
  *
  * @author hzpengjunjian@corp.netease.com
  */
object BeerSong {

  private def beer(n: Int, capitalize: Boolean = false): String = n match {
    case -1 => beer(99)
    case 0 => s"${if (capitalize) "N" else "n"}o more bottles of beer"
    case _ => s"$n bottle${if (n > 1) "s" else ""} of beer"
  }

  private def what(n: Int) = n match {
    case 0 => "Go to the store and buy some more"
    case _ => s"Take ${if (n > 1) "one" else "it"} down and pass it around"
  }

  def verse(b: Int): String =
    s"${beer(b, capitalize = true)} on the wall, ${beer(b)}.\n${what(b)}, ${beer(b-1)} on the wall.\n"

  def verses(b1: Int, b2: Int): String =
    b1.to(b2, -1).map(verse).mkString("\n")
}
