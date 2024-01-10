// Summary2/Task6.kt
package summaryIIExercise6
import atomictest.eq
import extensionlambdas.va

class Temperature {
  private var current = 0.0
  private var scale = "f"

//  fun setFahrenheit(now: Double) {
//    current = now
//    scale = "f"
//  }
//  fun setCelsius(now: Double) {
//    current = now
//    scale = "c"
//  }
//  fun getFahrenheit(): Double =
//    if (scale == "f")
//      current
//    else
//      current * 9.0 / 5.0 + 32.0
//  fun getCelsius(): Double =
//    if (scale == "c")
//      current
//    else
//      (current - 32.0) * 5.0 / 9.0

  var fahrenheit: Double = 0.0
    set(value) {
      current = value
      scale = "f"
      field = value
    }
    get() {
      if (scale == "f")
        return current
      else
        return current * 9.0 / 5.0 + 32.0
    }

  var celsius: Double = 0.0
    set(value) {
      current = value
      scale = "c"
      field = value
    }
    get() {
      if (scale == "c")
        return current
      else
        return (current - 32.0) * 5.0 / 9.0
    }
}

fun main() {
  val temp = Temperature()
  temp.fahrenheit = 98.6
  temp.fahrenheit eq 98.6
  temp.celsius eq 37.0
  temp.celsius = 100.0
  temp.fahrenheit eq 212.0
}