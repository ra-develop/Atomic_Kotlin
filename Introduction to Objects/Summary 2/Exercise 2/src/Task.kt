// Summary2/Task2.kt
package summaryIIExercise2
import atomictest.eq

class Boring2(val a: Double, val b: String, val c: Int) {
  fun a() = a
  fun b() = b
  fun c() = c
}

fun main() {
  val boring = Boring2(1.68, "text", 13)
  boring.a eq 1.68
  boring.b eq "text"
  boring.c eq 13
  boring.a() eq 1.68
  boring.b() eq "text"
  boring.c() eq 13
}