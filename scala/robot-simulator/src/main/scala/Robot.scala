/**
  * Created On 05/18 2017
  *
  * @author hzpengjunjian@corp.netease.com
  */
object Bearing extends Enumeration {
  type Bearing = Value
  val North, East, South, West = Value

  def step(bearing: Bearing): (Int, Int) = bearing match {
    case North => (0, 1)
    case East => (1, 0)
    case South => (0, -1)
    case West => (-1, 0)
  }

  def left(bearing: Bearing): Bearing = bearing match {
    case North => West
    case East => North
    case South => East
    case West => South
  }

  def right(bearing: Bearing): Bearing = bearing match {
    case North => East
    case East => South
    case South => West
    case West => North
  }
}

import Bearing._
case class Robot(bearing: Bearing, coordinates: (Int, Int)) {
  val (x, y) = coordinates

  implicit class Tuple2WithAddition(pair1: (Int, Int)) {
    def +(pair2: (Int, Int)): (Int, Int) = {
      (pair1._1 + pair2._1, pair1._2 + pair2._2)
    }
  }

  def advance() = Robot(bearing, coordinates + step(bearing))

  def turnLeft() = Robot(left(bearing), coordinates)

  def turnRight() = Robot(right(bearing), coordinates)

  def simulate(instructions: String): Robot =
    instructions.foldLeft(this)((last, ins) => {
      ins match {
        case 'L' => last.turnLeft()
        case 'R' => last.turnRight()
        case 'A' => last.advance()
      }
    })
}
