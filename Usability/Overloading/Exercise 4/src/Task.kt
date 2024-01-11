// Overloading/Task4.kt
package overloadingExercise4
import atomictest.eq

fun f(n: Int = 0, i: Int = n + 373) = i

fun main() {
  f() eq 373
}