/**
  * Created by mz on 2/20 020.
  */
class Bob {
  def hey(s: String): String = {
    // define "yell at" as "any letter appear" and "all letters are uppercase"
    if (s.foldLeft(false)((a, b) => a || b.isLetter) && s.equals(s.toUpperCase))
      "Whoa, chill out!"
    // define "question" as "end with ?"
    else if (s.endsWith("?"))
      "Sure."
    // empty saying.
    else if (s.trim.isEmpty)
      "Fine. Be that way!"
    else
      "Whatever."
  }
}
