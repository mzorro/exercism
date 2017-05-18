/**
  * Created On 05/18 2017
  *
  * @author hzpengjunjian@corp.netease.com
  */
object Isogram {
  def isIsogram(s: String) = {
    val letters = s.replaceAll("[^a-zA-Z]+", "").toLowerCase
    letters.toSet.size == letters.length
  }
}
