// Sets/Task2.kt
package setsExercise2
import kotlin.random.Random

fun experiment(): Int {
  var counter = 0
  val generatedSet = mutableSetOf<Int>()
  while (generatedSet.size < 25) {
    generatedSet.add(Random.nextInt(25) + 1)
    counter++
  }
  return counter
}

fun main() {
  val counts = mutableListOf<Int>()
  repeat(1000) {
    counts += experiment()
  }
  println(counts.average())
}