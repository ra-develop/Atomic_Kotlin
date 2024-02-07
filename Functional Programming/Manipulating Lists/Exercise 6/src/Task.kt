// ManipulatingLists/Task6.kt
package manipulatingListsExercise6
import atomictest.eq
import manipulatingListsExercise5.flatMap

fun <T> List<List<T>>.flatten(): List<T> =
  flatMap {
    it
  }

fun main() {
  val listOfLists = listOf(listOf(1, 2, 3), listOf(4, 5, 6))

  listOfLists.flatten() eq listOf(1, 2, 3, 4, 5, 6)
}