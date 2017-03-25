/**
  * Created by mz on 3/25 025.
  */
object Sublist {
  abstract class SublistResult
  object Equal extends SublistResult
  object Unequal extends SublistResult
  object Sublist extends SublistResult
  object Superlist extends SublistResult

  implicit class MyList[T](ls: List[T]) {
    def hasSublist(l2: List[T]): Boolean = ls.indexOfSlice(l2) != -1
  }

  def sublist[T](l1: List[T], l2: List[T]): SublistResult =
    if (l1.equals(l2))
      Equal
    else if (l1.hasSublist(l2))
      Superlist
    else if (l2.hasSublist(l1))
      Sublist
    else
      Unequal
}

