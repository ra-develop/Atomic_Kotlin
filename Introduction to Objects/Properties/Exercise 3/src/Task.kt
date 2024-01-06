// Properties/Task3.kt
package propertiesExercise3

class Robot {
  var x = 0
  var y = 0
  private val maxSize = 100

  fun right(steps: Int) {
    x += steps % maxSize
    if (x > maxSize) x -= maxSize
  }

  fun left(steps: Int) {
    x -= steps % maxSize
    if (x < 0) x += maxSize
  }

  fun down(steps: Int) {
    y += steps % maxSize
    if (y > maxSize) y -= maxSize
  }

  fun up(steps: Int) {
    y -= steps % maxSize
    if (y < 0) y += maxSize
  }

  fun getLocation(): String = "($x, $y)"
}

fun main() {
  val robot = Robot()
  println(robot.getLocation())
  robot.up(1)
  println(robot.getLocation())
  robot.left(10)
  println(robot.getLocation())
}
/* Output:
(0, 0)
(0, 99)
(90, 99)
*/