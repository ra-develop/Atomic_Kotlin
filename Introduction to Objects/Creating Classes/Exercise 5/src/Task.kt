// CreatingClasses/Task5.kt
package creatingClassesExercise5

fun cap(s: String) = s.replaceFirstChar { char ->
  char.uppercase()
}

fun main() {
  println(cap("hi!"))
  println(cap("Hi!"))
}
/* Output:
Hi!
Hi!
 */