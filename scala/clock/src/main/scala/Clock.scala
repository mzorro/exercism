/**
  * Created On 05/18 2017
  *
  * @author hzpengjunjian@corp.netease.com
  */
case class Clock(h: Int, m: Int) {

  def this(m: Int) = this(0, m)

  private var mm = h * 60 + m
  while (mm < 0) mm += 24 * 60
  mm = mm % (24 * 60)

  override def toString: String = "%02d:%02d".format(mm/60, mm%60)


  override def equals(obj: scala.Any): Boolean = obj match {
    case o: Clock => mm == o.mm
  }

  def +(o: Clock) = Clock(mm + o.mm)

  def -(o: Clock) = Clock(mm - o.mm)
}

object Clock {
  def apply(m: Int): Clock = Clock(0, m)
}
