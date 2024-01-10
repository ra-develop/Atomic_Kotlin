// Summary2/Task5.kt
package summaryIIExercise5

fun va1(vararg intArgs: Int) {
  println("va1:")
  for (arg in intArgs) {
    println(arg)
  }
}

fun va2(vararg intArgs: Int) {
  println("va2:")
  va1(*intArgs)
}

fun main() {
  va1(1, 2, 3)
  va2(4, 5, 6)
}
/* Expected output:
va1:
1
2
3
va2:
va1:
4
5
6
 */