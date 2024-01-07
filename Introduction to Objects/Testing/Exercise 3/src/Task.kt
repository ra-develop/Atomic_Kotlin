// Testing/Task3.kt
package testingExercise3
import atomictest.eq

fun squareArea(x: Int) = x * x

fun rectangleArea(x: Int, y: Int) = x * y

fun trapezoidArea(x: Int, y: Int, h: Int) = h / 2.0 * (x + y)

fun main() {
  squareArea(1) eq 1
  squareArea(2) eq 4
  squareArea(5) eq 25
  rectangleArea(2,3) eq 6
  rectangleArea(1,1) eq 1
  rectangleArea(10,20) eq 200
  trapezoidArea(3,3,2) eq 6.0
  trapezoidArea(5,7,8) eq 48.0
  trapezoidArea(9,2,9) eq 49.5
}