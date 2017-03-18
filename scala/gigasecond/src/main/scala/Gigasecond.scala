import java.time.temporal.ChronoUnit
import java.time.{LocalDate, LocalDateTime, LocalTime}

/**
  * Created by mz on 3/18 018.
  */
object Gigasecond {

  def addGigaseconds(datetime: LocalDateTime): LocalDateTime =
    datetime.plus(1000000000L, ChronoUnit.SECONDS)

  def addGigaseconds(date: LocalDate): LocalDateTime =
    addGigaseconds(LocalDateTime.of(date, LocalTime.MIN))
}
