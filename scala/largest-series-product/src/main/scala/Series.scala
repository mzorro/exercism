object Series {
  def largestProduct(n: Int, seq: String): Option[Int] = {
    if (n < 0 || n > seq.length) None
    else if (n == 0) Some(1)
    else if (seq.exists(!_.isDigit)) None
    else {
      val array = seq.map(_.toString.toInt).dropWhile(_ == 0).toArray
      if (array.length == 0) Some(0)
      else {
        var curProduct = array(0)
        var maxProduct = 0
        var lastIndex = 0
        for (i <- 1 until array.length) {
          val v = array(i)
          if (v == 0) {
            lastIndex = i + 1
            curProduct = 1
          } else {
            if (i - lastIndex + 1 > n) curProduct /= array(i-n)
            curProduct *= v
            if (i - lastIndex + 1 >= n && curProduct > maxProduct)
              maxProduct = curProduct
          }
        }
        Some(maxProduct)
      }
    }
  }
}