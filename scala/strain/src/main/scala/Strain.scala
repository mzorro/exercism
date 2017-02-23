object Strain {
  def keep[T](input: Seq[T], predicate: (T) => Boolean): Seq[T] = {
    input.filter(predicate)
  }

  def discard[T](input: Seq[T], predicate: (T) => Boolean): Seq[T] = {
    input.filterNot(predicate)
  }
}