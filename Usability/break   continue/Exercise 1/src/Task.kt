// BreakAndContinue/Task1.kt
package breakAndContinueExercise1
import atomictest.*

fun readNumbers(vararg n: String) {
  var sum = 0
  outer@ for (arg in n) {
    val intArg = arg.toIntOrNull()
    when (intArg) {
      null -> {
        trace("Not a number: $arg")
      }
      0 -> {
        break
      }
      else -> sum += intArg
    }
  }
  trace("Sum: $sum")
}

fun main() {
  readNumbers("1", "a", "3", "10", "0", "19")
  trace eq """
    Not a number: a
    Sum: 14
  """
}