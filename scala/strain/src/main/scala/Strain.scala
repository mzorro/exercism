object Strain {
  def keep[T](input: Seq[T], predicate: (T) => Boolean): Seq[T] =
    input.foldRight(List.empty[T])((t, seq) => if (predicate(t)) t :: seq else seq)

  def discard[T](input: Seq[T], predicate: (T) => Boolean): Seq[T] =
    keep(input, !predicate(_: T))
}