// ExpressionsStatements/Task2.kt
package expressionsAndStatementsExercise2

fun f(i1:Int, i2:Int) = i1 + i2

fun g(s1: String, s2: String) = s1 + s2

fun h() = println("h()")

fun main() {
  val ff: Int = f(2,3)
  val gg: String = g("abc", "def")
  val hh: Unit = h()
  println("Int")
  println("String")
  println("Unit")
}