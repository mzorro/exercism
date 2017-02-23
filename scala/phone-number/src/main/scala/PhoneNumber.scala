/**
  * Created by mz on 2/23 023.
  */
class PhoneNumber(str: String) {

  val digits = str.filter(_.isDigit)
  val number: Option[String] =
    if (digits.length == 10)
      Some(digits)
    else if (digits.length == 11 && digits.head == '1')
      Some(digits.tail)
    else
      None

  val areaCode: Option[String] =
    if (number.isDefined)
      Some(number.get.take(3))
    else
      None

  val prettyPrint: Option[String] =
    if (number.isDefined)
      Some(s"(${number.get.take(3)}) ${number.get.slice(3, 6)}-${number.get.drop(6)}")
    else
      None
}
