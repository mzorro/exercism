import scala.collection.mutable.ArrayBuffer

object Strain {
  def keep[T](input: Seq[T], predicate: (T) => Boolean): Seq[T] = {
    val output = ArrayBuffer[T]()
    for (item <- input)
      if (predicate(item)) output += item
    output
  }

  def discard[T](input: Seq[T], predicate: (T) => Boolean): Seq[T] = {
    val output = ArrayBuffer[T]()
    for (item <- input)
      if (!predicate(item)) output += item
    output
  }
}