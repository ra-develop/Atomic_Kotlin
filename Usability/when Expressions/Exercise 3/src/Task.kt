// WhenExpressions/Task3.kt
package whenExpressionsExercise3
import atomictest.eq

fun balanced(input: String): Boolean {
  if (input.first() == ')') return false
  var counterLeftParentheses = 0
  for (ch in input) {
    when(ch) {
      '(' -> counterLeftParentheses++
      ')' -> counterLeftParentheses--
      ' ' -> {}
      else -> throw IllegalArgumentException()
    }
  }
  if (counterLeftParentheses != 0) return false
  return true
}

fun main() {
  balanced("(()) ()") eq true
  balanced(")(") eq false
  balanced("((()") eq false
}