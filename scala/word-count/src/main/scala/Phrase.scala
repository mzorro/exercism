/**
  * Created by mz on 2/21 021.
  */
class Phrase(str: String) {
  def wordCount: Map[String, Int] =
    str.toLowerCase
      .split("[^\\w']").filterNot(_.isEmpty)
      .map((_, 1)).groupBy(_._1).mapValues(_.map(_._2).sum)
}
