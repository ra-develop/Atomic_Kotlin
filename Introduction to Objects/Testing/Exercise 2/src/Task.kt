// Testing/Task2.kt
package testingExercise2
import atomictest.eq
import atomictest.neq

fun sum(a: Int, b: Int, c: Int): Int = a + b + c

fun main() {
  sum(1,2,3) eq 6
  sum(4,5,6) eq 15
  sum(-1,-2,-3) eq -6
  sum(-4,5,-6) eq -5
  sum(0,0,1,) neq 0
}