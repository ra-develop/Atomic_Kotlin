// Summary2/Task8.kt
package summaryIIExercise8
import atomictest.eq

val romanNumeralToIntMap: Map<String, Int> = mapOf(
   "M" to 1000,
//  "CM" to 900 ,
   "D" to 500 ,
//  "CD" to 400 ,
   "C" to 100 ,
//  "XC" to 90  ,
   "L" to 50  ,
//  "XL" to 40  ,
   "X" to 10  ,
//  "IX" to 9   ,
   "V" to 5   ,
//  "IV" to 4   ,
   "I" to 1   ,
)

fun convertFromRoman(roman: String): Int {
  var result = 0
  var romanReverted = roman.reversed()
  var previousNumeral = 0
  for ( i in romanReverted.indices)  {
    val numeral = romanNumeralToIntMap.getValue(romanReverted[i].toString())
    if (numeral < previousNumeral  ) {
      result -= numeral
    } else {
      result += numeral
    }
    previousNumeral = numeral
  }
  return result
}

fun main() {
  convertFromRoman("XXIII") eq 23
  convertFromRoman("XLIV") eq 44
  convertFromRoman("C") eq 100
  convertFromRoman("MMXVIII") eq 2018
}