object Strain {
  def keep[T](input: Seq[T], predicate: (T) => Boolean): Seq[T] =
    input.foldLeft(Seq.empty[T])((seq, t) => if (predicate(t)) seq :+ t else seq)

  def discard[T](input: Seq[T], predicate: (T) => Boolean): Seq[T] =
    keep(input, (t: T) => !predicate(t))
}