object Strain {
  def keep[T](input: Seq[T], predicate: (T) => Boolean): Seq[T] = {
    var output = List[T]()
    for (item <- input)
      if (predicate(item)) output = output ::: List(item)
    output
  }

  def discard[T](input: Seq[T], predicate: (T) => Boolean): Seq[T] =
    keep(input, (t: T) => !predicate(t))
}