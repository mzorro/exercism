/**
  * Created by mz on 3/17 017.
  */
case class SpaceAge(seconds: Long) {
  val earthYears: Double = seconds / 31557600.0

  def round2(d: Double): Double = (math rint d * 100) / 100
  def onPlanet(earthYearTimes: Double): Double = round2(earthYears / earthYearTimes)

  val onEarth: Double = onPlanet(1)
  val onMercury: Double = onPlanet(0.2408467)
  val onVenus: Double = onPlanet(0.61519726)
  val onMars: Double = onPlanet(1.8808158)
  val onJupiter: Double = onPlanet(11.862615)
  val onSaturn: Double = onPlanet(29.447498)
  val onUranus: Double = onPlanet(84.016846)
  val onNeptune: Double = onPlanet(164.79132)
}