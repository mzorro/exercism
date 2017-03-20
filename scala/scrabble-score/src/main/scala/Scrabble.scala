/**
  * Created by mz on 3/20 020.
  */
object Scrabble {
  var scores: Map[Char, Int] =
    """
      |AEIOULNRST 1
      |DG 2
      |BCMP 3
      |FHVWY 4
      |K 5
      |JX 8
      |QZ 10
    """.stripMargin.trim.split("[\r\n]+").map(_.split(" "))
      .flatMap(a => a(0).map((_, a(1).toInt)))
      .toMap

  def scoreLetter(c: Char): Int = scores(c.toUpper)

  def scoreWord(s: String): Int = s.toUpperCase.map(scores(_)).sum
}
