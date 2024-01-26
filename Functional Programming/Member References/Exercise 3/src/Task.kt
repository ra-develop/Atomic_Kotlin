// MemberReferences/Task3.kt
package memberReferencesExercise3
import atomictest.eq

val Int.isEven: Boolean
  get() = this % 2 == 0

// Returns all the divisors of the number
// except 1 and the number itself
private fun getNonTrivialDivisors(num: Int): List<Int> {
  var result = mutableListOf<Int>()
  for (divider in 2 until num) {
    if (num % divider == 0) result.add(divider)
  }
  return result
}

fun Int.isPrime(): Boolean {
  return getNonTrivialDivisors(this).isEmpty() && this != 1
}

fun isPerfect(num: Int): Boolean {
  if (num == 1) return false
  val notTrivialDivisors = getNonTrivialDivisors(num)
  val sumOfDivisors = notTrivialDivisors.sum() + 1
  return num == sumOfDivisors
}

fun main() {
  val range = 1..1000
  val even = range.filter(Int::isEven)
  even.size eq 500

  val prime = range.filter(Int::isPrime)
  prime.take(7) eq listOf(2, 3, 5, 7, 11, 13, 17)
  prime.takeLast(7) eq
    listOf(953, 967, 971, 977, 983, 991, 997)

  val perfect = range.filter(::isPerfect)
  perfect eq listOf(6, 28, 496)
  // 6 = 1 + 2 + 3
  // 28 = 1 + 2 + 4 + 7 + 14
}