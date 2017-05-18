/**
  * Created On 05/18 2017
  *
  * @author hzpengjunjian@corp.netease.com
  */
object ProteinTranslation {

  val map: Map[String, String] =
  """
    |AUG                   | Methionine
    |UUU, UUC              | Phenylalanine
    |UUA, UUG              | Leucine
    |UCU, UCC, UCA, UCG    | Serine
    |UAU, UAC              | Tyrosine
    |UGU, UGC              | Cysteine
    |UGG                   | Tryptophan
    |UAA, UAG, UGA         | STOP
  """.stripMargin.trim.split("\n")
    .map(_.replaceAll("\\s+", "").split("\\|"))
    .flatMap(a => a(0).split(",").map((_, a(1))))
    .toMap

  def translate(s: String): Seq[String] = {
    if ((s.length > 0) && (s.length % 3 == 0)) {
      val next = map.getOrElse(s.substring(0, 3), "STOP")
      if (next == "STOP") Seq()
      else next +: translate(s.substring(3))
    } else Seq()
  }
}
