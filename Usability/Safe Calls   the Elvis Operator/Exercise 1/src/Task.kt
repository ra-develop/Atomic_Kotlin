// SafeCallsAndElvis/Task1.kt
package safeCallsAndTheElvisOperatorExercise1
import atomictest.eq

fun downcase(s: String?): String {
  return s?.lowercase() ?: ""
}

fun main() {
  downcase(null) eq ""
  downcase("ABC") eq "abc"
}