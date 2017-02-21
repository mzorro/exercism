/**
  * Created by mz on 2/21 021.
  */
class Anagram(str: String) {
  private def matches(that: String): Boolean = {
    if (that.length != str.length || that == str) return false
    str.length == that.length && str != that &&
      str.map(_.isUpper) == that.map(_.isUpper) &&
      str.toLowerCase.sorted == that.toLowerCase.sorted
  }

  def matches(input: Seq[String]): Seq[String] = input.filter(matches)
}
