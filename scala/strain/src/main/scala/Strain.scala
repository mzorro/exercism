object Strain {
  def keep[T](input: Seq[T], predicate: (T) => Boolean): Seq[T] =
    if (input.isEmpty)
      input
    else if (predicate(input.head))
      Seq(input.head) ++ keep(input.tail, predicate)
    else
      keep(input.tail, predicate)

  def discard[T](input: Seq[T], predicate: (T) => Boolean): Seq[T] =
    keep(input, (t: T) => !predicate(t))
}