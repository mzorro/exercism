class DNA(dna: String) {
  val nucleotides = "GACT"
  var map = Map.empty[Char, Int]
  var error: Option[String] = None
  dna.foreach (c => {
    if (nucleotides.contains(c))
      map += (c -> (map.getOrElse(c, 0) + 1))
    else
      error = Some(s"invalid nucleotide '$c'")
  })

  def count(char: Char): Either[String, Int] = {
    if (error.isEmpty && !nucleotides.contains(char))
      error = Some(s"invalid nucleotide '$char'")
    if (error.isDefined)
      Left(error.get)
    else
      Right(map.getOrElse(char, 0))
  }

  def nucleotideCounts: Either[String, Map[Char, Int]] =
    if (error.isDefined)
      Left(error.get)
    else
      Right(map)
}
