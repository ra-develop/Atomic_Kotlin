// Summary1/Task6.kt
package summaryIExercise6

fun everyFifthNonSpace(s: String) {
  var counter = 1
  for (c in s) {
    if (c != ' ') {
      if (counter == 5) {
        counter = 1
        println(c)
      } else {
        counter++
      }
    }
  }
}

fun main() {
  everyFifthNonSpace("abc d e fgh ik")
}
/* Output:
e
k
*/