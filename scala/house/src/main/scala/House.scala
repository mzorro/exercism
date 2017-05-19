/**
  * Created On 05/19 2017
  *
  * @author hzpengjunjian@corp.netease.com
  */
object House {
  private val source =
    """
      |               ,horse and the hound and the horn
      |belonged to    ,farmer sowing his corn
      |kept           ,rooster that crowed in the morn
      |woke           ,priest all shaven and shorn
      |married        ,man all tattered and torn
      |kissed         ,maiden all forlorn
      |milked         ,cow with the crumpled horn
      |tossed         ,dog
      |worried        ,cat
      |killed         ,rat
      |ate            ,malt
      |lay in         ,house that Jack built.
    """.stripMargin.trim.split("[\r\n]+").map(_.split(",").map(_.trim))

  val rhyme: String =
    source.indices.map(source.drop)
      .map(_.zipWithIndex.map {
        case (a, i) => (if (i == 0) "This is" else "that " + a(0)) + " the " + a(1)
      }).reverse.map(_.mkString("\n")).mkString("\n\n") + "\n\n"
}
