/**
  * Created by pengjunjian on 5/2 002.
  */
object Sieve {
  def primesUpTo(n: Int): List[Int] = {
    val isComposite = Array.fill(n+1)(false)
    var primeList = List.empty[Int]

    def isAlreadyPrime(n: Int) =
      if (!isComposite(n)) {
        primeList = primeList :+ n
        true
      } else false

    (2 to n).toStream.filter(isAlreadyPrime).foreach(i => {
      (2 to n/i).map(_ * i).foreach(isComposite(_) = true)
    })
    primeList
  }
}
