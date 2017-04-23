import TriangleType.{Equilateral, Illogical, Isosceles, Scalene}

/**
  * Created by pengjunjian on 4/23 023.
  */
case class Triangle(a: Int, b: Int, c: Int) {
  val Array(sa, sb, sc) = Array(a, b, c).sortBy(-_)
  val triangleType: TriangleType.Type =
    if (a <= 0 || b <= 0 || c <= 0 || sa >= sb + sc)
      Illogical
    else if (sa == sb && sb == sc)
      Equilateral
    else if (sa == sb || sb == sc)
      Isosceles
    else
      Scalene
}

object TriangleType {
  abstract class Type
  object Equilateral extends Type
  object Isosceles extends Type
  object Scalene extends Type
  object Illogical extends Type
}

