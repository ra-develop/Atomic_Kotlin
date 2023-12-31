// ObjectsEverywhere/Task3.kt
package objectsEverywhereExercise3

fun isPalindrome(s: String): Boolean =
  s.reversed() == s

fun isPalIgnoreCase(s: String): Boolean =
  isPalindrome(s.lowercase())

fun isPalIgnoreSpecial(s: String): Boolean {
  val newString = s.filter { ch: Char ->
    ch in 'a' .. 'z' || ch in 'A'.. 'Z'
  }.lowercase()
  return newString == newString.reversed()
}

fun main() {
  println(isPalIgnoreSpecial("Was It A Rat I Saw? ..."))  // true
}