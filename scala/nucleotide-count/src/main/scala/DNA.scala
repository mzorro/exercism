class DNA(dna: String) {
  val nucleotides = "GACT"
  var map = Map.empty[Char, Int]
  var error: Option[String] = None
  nucleotides.foreach(c => map += (c -> 0))
  dna.foreach (c => {
    if (nucleotides.contains(c))
      map += (c -> (map(c) + 1))
    else
      error = Some(s"invalid nucleotide '$c'")
  })

  def count(char: Char): Either[String, Int] = {
    if (error.isEmpty && !nucleotides.contains(char))
      error = Some(s"invalid nucleotide '$char'")
    if (error.isDefined)
      Left(error.get)
    else
      Right(map(char))
  }

  def nucleotideCounts: Either[String, Map[Char, Int]] =
    if (error.isDefined)
      Left(error.get)
    else
      Right(map)
}
