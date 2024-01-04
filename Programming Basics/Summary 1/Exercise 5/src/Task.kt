// Summary1/Task5.kt
package summaryIExercise5

fun everyFifth(start: Int, end: Int) {
  val range = start .. end
  for (i in range.withIndex()) {
    if ((i.index + 1) % 5 == 0) println(i.value)
  }
}

fun main() {
  everyFifth(11, 30)
}
/* Output:
15
20
25
30
*/