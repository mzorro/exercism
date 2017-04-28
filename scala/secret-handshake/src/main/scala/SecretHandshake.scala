/**
  * Created by pengjunjian on 4/28 028.
  */
object SecretHandshake {


  val handshakeMap = Map(
    4 -> "jump", 3 -> "close your eyes",
    2 -> "double blink", 1 -> "wink"
  )

  def handshake(n: Int): List[String] = {
    def hasBit(index: Int): Boolean = ((n >> (index - 1)) & 1) == 1
    val result = (1 to 4).filter(hasBit).flatMap(handshakeMap.get).toList
    if (hasBit(5))
      result.reverse
    else
      result
  }

  def handshake(binary: String): List[String] = {
    try {
      handshake(Integer.parseInt(binary, 2))
    } catch {
      case _: Throwable =>
        List.empty[String]
    }
  }
}
