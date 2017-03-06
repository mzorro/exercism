import java.time.LocalDate
import java.util.Calendar

/**
  * Created by mz on 3/6 006.
  */
class Meetup(month: Int, year: Int) {
  private val cal = Calendar.getInstance
  cal.set(Calendar.YEAR, year)
  cal.set(Calendar.MONTH, month-1)
  private val lastDayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH)

  def getDayOfMonth(fromDay: Int, toDay: Int, weekDay: Int): LocalDate = {
    val day = (fromDay to toDay).filter { day =>
      cal.set(Calendar.DAY_OF_MONTH, day)
      cal.get(Calendar.DAY_OF_WEEK) == weekDay
    }.head
    LocalDate.of(year, month, day)
  }

  def teenth(weekDay: Int): LocalDate = getDayOfMonth(13, 19, weekDay)

  def first(weekDay: Int): LocalDate = getDayOfMonth(1, 7, weekDay)

  def second(weekDay: Int): LocalDate = getDayOfMonth(8, 14, weekDay)

  def third(weekDay: Int): LocalDate = getDayOfMonth(15, 21, weekDay)

  def fourth(weekDay: Int): LocalDate = getDayOfMonth(22, 28, weekDay)

  def last(weekDay: Int): LocalDate = getDayOfMonth(lastDayOfMonth-6, lastDayOfMonth, weekDay)
}

object Meetup {
  val Sun: Int = Calendar.SUNDAY
  val Mon: Int = Calendar.MONDAY
  val Tue: Int = Calendar.TUESDAY
  val Wed: Int = Calendar.WEDNESDAY
  val Thu: Int = Calendar.THURSDAY
  val Fri: Int = Calendar.FRIDAY
  val Sat: Int = Calendar.SATURDAY
  def apply(month: Int, year: Int): Meetup = new Meetup(month, year)
}
