trait SimpleLinkedList[T] {
  def isEmpty: Boolean

  def value: T

  def add(item: T): SimpleLinkedList[T]

  def next: SimpleLinkedList[T]

  def reverse: SimpleLinkedList[T]

  def toSeq: Seq[T]
}

case class LinkedListNode[T](elems: T*) extends SimpleLinkedList[T] with Iterable[T] {

  elems.foldLeft(this)(_ add _)

  var value: T = _

  lazy val next: LinkedListNode[T] = LinkedListNode[T]()

  override def isEmpty: Boolean = value == null

  def add(item: T): LinkedListNode[T] = {
    if (isEmpty) value = item else next add item
    this
  }

  override def reverse: LinkedListNode[T] = LinkedListNode[T](toSeq.reverse: _*)

  override def toSeq: Seq[T] = iterator.toSeq

  override def iterator: Iterator[T] = new Iterator[T] {
    var node: LinkedListNode[T] = LinkedListNode.this

    override def hasNext: Boolean = !node.isEmpty

    override def next(): T = {
      val value = node.value
      node = node.next
      value
    }
  }
}

object SimpleLinkedList {
  def apply[T](elems: T*): SimpleLinkedList[T] = LinkedListNode[T](elems: _*)

  def fromSeq[T](elems: Seq[T]): SimpleLinkedList[T] = LinkedListNode[T](elems: _*)
}