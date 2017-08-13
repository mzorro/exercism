object Acronym {
  def abbreviate(phrase: String): String = phrase.split("[\\s-]").map(_.head.toUpper).mkString("")
}
