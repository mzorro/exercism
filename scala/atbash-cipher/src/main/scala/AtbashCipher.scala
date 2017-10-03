object AtbashCipher {
  def enc(c: Char): Char = if (c.isLetter) ('z' - c + 'a').toChar else c

  def encode(s: String) = {
    val encoded = s.filter(_.isLetterOrDigit).map(_.toLower).map(enc)
    (0 until (encoded.length + 4) / 5).map(i => encoded.slice(i * 5, (i + 1) * 5).mkString).mkString(" ")
  }

  def decode(s: String) = s.filter(_.isLetterOrDigit).map(_.toLower).map(enc).mkString
}
