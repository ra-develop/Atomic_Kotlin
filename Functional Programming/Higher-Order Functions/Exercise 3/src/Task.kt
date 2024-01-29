// HigherOrderFunctions/Task3.kt
package higherOrderFunctionsExercise3
import atomictest.eq

fun <T, R : Any> Iterable<T>.mapIndexedNotNull(
  transform: (Int, T) -> R?
): List<R> {
  val result = mutableListOf<R>()
  forEachIndexed { index, t ->
    val element = transform(index, t)
    if (element != null) result += element
  }
  return result
}

fun main() {
  val list = listOf("a", "b", "c", "d")
  list.mapIndexedNotNull { index, s ->
    if (index % 2 == 0) "$s!" else null
  } eq listOf("a!", "c!")
}