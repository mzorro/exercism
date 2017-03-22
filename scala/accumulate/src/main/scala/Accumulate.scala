/**
  * Created by mz on 3/22 022.
  */
class Accumulate {
  def accumulate[A, B](f: (A) => B, input: Seq[A]): Seq[B] = {
    input.foldRight(Seq.empty[B])((a, output) => f(a) +: output)
  }
}
