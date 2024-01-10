// Summary2/Task3.kt
package summaryIIExercise3
import atomictest.*

class FixedSizeHolder(private val maximumNumbers: Int) {
  private var _objects: MutableList<Any> = mutableListOf()
  val size: Int
    get() {
      return _objects.size
    }

  val full: Boolean
    get() {
      return size == maximumNumbers
    }

  fun add(obj: Any) {
    if (full) {
      throw IllegalStateException("The container is full")
    }
    _objects += obj
  }
}

fun main() {
  val holder = FixedSizeHolder(2)
  holder.add("What is the answer?")
  holder.add(42)
  holder.full eq true
  holder.size eq 2
  capture {
    holder.add("!!!")
  } eq "IllegalStateException: The container is full"
}