object BinarySearch {
  def search(arr: Array[Int], key: Int, l: Int, h: Int): Option[Int] = {
    if (l > h) return None

    val m = (l + h) / 2
    if (arr(m) == key)
      Some(m)
    else if (arr(m) > key)
      search(arr, key, l, m-1)
    else
      search(arr, key, m+1, h)
  }

  def search(arr: Array[Int], key: Int): Option[Int] = {
    search(arr, key, 0, arr.length-1)
  }
}