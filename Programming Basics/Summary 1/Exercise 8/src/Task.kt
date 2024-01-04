// Summary1/Task8.kt
package summaryIExercise8

fun reverseDecimal(number: Int): Int {
  var worker = number
  var result = 0
  while (worker > 0) {
    result *= 10
    result += worker % 10
    worker /= 10
  }
  return result
}

fun main() {
//  var worker = 1234
//  var result = 0
//
//    val t = worker % 10
//    result += t
//    result *= 10
//    worker /= 10
//  println(result)
//
//  println(worker)
  println(reverseDecimal(123456789))  // 4321
}