// InKeyword/Task4.kt
package theInKeywordExercise4

fun isValidCharacter(char: Char): Boolean =
  char in 'a' .. 'z' || char in 'A' .. 'Z'
          || char in '0' .. '9' || char == '_'

fun isValidIdentifier(s: String): Boolean {
  if (s.isEmpty() || s[0] in '0' .. '9') {
    return false
  }
  for (i in 0 .. s.lastIndex) {
    if (!isValidCharacter(s[i])) {
      return false
    }
  }
  return true
}

fun main() {
  println(isValidIdentifier("name"))  // true
  println(isValidIdentifier("0name"))  // false
}