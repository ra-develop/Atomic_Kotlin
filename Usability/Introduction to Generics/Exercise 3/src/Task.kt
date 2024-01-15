// IntroGenerics/Task3.kt
package introductionToGenericsExercise3
import atomictest.eq

class CountingSet<E> {
  private val container = mutableMapOf<E, Int>()
  fun add(element: E) {
      container[element] = (container[element] ?: 0) + 1
  }
  fun count(element: E) = container[element] ?: 0

  fun toSet() = container.keys.toSet()
}

fun main() {
  val cs = CountingSet<String>()
  cs.add("abc")
  cs.add("abc")
  cs.add("def")
  cs.count("abc") eq 2
  cs.count("def") eq 1
  cs.count("xyz") eq 0
  cs.toSet() eq setOf("abc", "def")
}