// Summary1/Task10.kt
package summaryIExercise10

fun showSnake(rows: Int, columns: Int) {
  val width = (rows * columns).toString().length
  var currentDigit = 0
  repeat(rows) {currentRow ->
    if (currentRow % 2 == 0) {
      repeat(columns) {
        print(" %${width}d".format(currentDigit))
        currentDigit ++
      }
    } else {
      currentDigit += columns - 1
      repeat (columns) {
        print(" %${width}d".format(currentDigit - it))
      }
      currentDigit ++
    }
    println()
  }

}

fun main() {
  showSnake(2, 3)
  println()
  showSnake(4, 5)
}
/* Output:
 0 1 2
 5 4 3

  0  1  2  3  4
  9  8  7  6  5
 10 11 12 13 14
 19 18 17 16 15
*/