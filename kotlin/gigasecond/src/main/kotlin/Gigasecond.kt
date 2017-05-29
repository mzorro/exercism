import java.time.LocalDate
import java.time.LocalDateTime

/**
 * Created On 05/29 2017
 *
 * @author hzpengjunjian@corp.netease.com
 */
class Gigasecond(age: LocalDateTime) {

    constructor(age: LocalDate) : this(age.atStartOfDay())

    val date: LocalDateTime = age.plusSeconds(1000000000)
}