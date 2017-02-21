object RunLengthEncoding {

  def encode(str: String): String = {
    val len = str.length
    if (len == 0) return ""

    var last: Char = str(0)
    var count: Int = 1
    val result: StringBuilder = new StringBuilder
    def append = {
      result.append(if (count > 1) s"$count" else "")
      result.append(last)
    }
    for (i <- 1 until len) {
      val c = str(i)
      if (c == last) count += 1
      else {
        append
        count = 1
        last = c
      }
    }
    append
    result.toString
  }

  private def readOne(s: String): (Int, Char, String) = {
    var i = 0
    while (s(i).isDigit) i+=1
    if (i == 0) (1, s(0), s.drop(1))
    else (s.take(i).toInt, s(i), s.drop(i+1))
  }

  def decode(str: String): String = {
    if (str.isEmpty) return ""
    val (n, c, remaining) = readOne(str)
    val res = new StringBuilder
    for (_ <- 1 to n) res.append(c)
    res.toString + decode(remaining)
  }
}
