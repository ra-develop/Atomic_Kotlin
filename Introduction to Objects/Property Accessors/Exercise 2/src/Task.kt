// PropertyAccessors/Task2.kt
package propertyAccessorsExercise2
import atomictest.eq

class Accessible {
  var mutable: String = ""
    set(value) {
      println("mutable:set")
      field = value
    }
    get() {
      println("mutable:get")
      return field
    }

  val readOnly: String
    get() {
      println("readOnly:get")
      return mutable
    }
}

fun main() {
  val accessible = Accessible()
  accessible.mutable = "abc"
  accessible.readOnly eq "abc"
}
/* Expected output:
mutable:set
readOnly:get
mutable:get
abc
 */