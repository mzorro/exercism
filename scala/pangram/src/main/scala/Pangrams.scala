/**
  * Created by mz on 2/21 021.
  */
object Pangrams {
  def isPangram(s: String): Boolean =
    s.toLowerCase.replaceAll("[^a-z]", "").toSet.size == 26
}
