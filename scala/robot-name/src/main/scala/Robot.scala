/**
  * Created by mz on 2/23 023.
  */
class Robot {
  def newName: String = {
    import Robot._
    val nextName = availableNames.head
    availableNames -= nextName
    nextName
  }

  var name: String = newName
  def reset(): Unit = name = newName
}

object Robot {
  var availableNames: Set[String] = Set()

  for {
    l1 <- 'A' to 'Z'
    l2 <- 'A' to 'Z'
    n <- 0 to 999
  } availableNames += "%c%c%03d".format(l1, l2, n)
}
