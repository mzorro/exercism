/**
  * Created On 10/29 2017
  *
  * @author hzpengjunjian@corp.netease.com
  */
object CollatzConjecture {
  def steps(n: Int): Option[Int] = if (n <= 0) None else Some(steps0(n))

  private def steps0(n: Int): Int = if (n == 1) 0 else 1 + steps0(if (n % 2 == 0) n / 2 else 1 + 3 * n)
}
