// Summary1/Task9.kt
package summaryIExercise9

fun printTriangle(n: Int) {
  for (i in 1 .. n) {
    repeat (n - i) {
      print(" ")
    }
    repeat (2 * i -1) {
      print("#")
    }
    print("\n")
  }
}

fun main() {
  printTriangle(4)
}
/* Output:
   #
  ###
 #####
#######
*/