import Allergen.Allergen

object Allergies {
  def isAllergicTo(allergen: Allergen, score: Int): Boolean = ((1 << allergen.id) & score) != 0

  def allergies(score: Int): List[Allergen] = Allergen.values.filter(isAllergicTo(_, score)).toList
}

object Allergen extends Enumeration {
  type Allergen = Value
  val Eggs, Peanuts, Shellfish, Strawberries, Tomatoes, Chocolate, Pollen, Cats = Value
}
