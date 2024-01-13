// NullableTypes/Task2.kt
package nullableTypesExercise2

 fun zilch(): String? {
   return null
 }
 fun zilch2(): String? {
   return zilch()
 }

fun main() {
   var x = zilch()
   var y = zilch2()
}