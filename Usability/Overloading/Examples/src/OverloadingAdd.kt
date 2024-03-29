// Overloading/OverloadingAdd.kt
package overloading
import atomictest.eq

fun addInt(i: Int, j: Int) = i + j
fun addDouble(i: Double, j: Double) = i + j

fun addString(i: String, j: String) = i + j

fun add(i: Int, j: Int) = i + j
fun add(i: String, j: String) = i + j
fun add(i: Double, j: Double) = i + j

fun main() {
  addInt(5, 6) eq add(5, 6)
  addDouble(56.23, 44.77) eq
    add(56.23, 44.77)
  addString("56.23", "44.77") eq
          add("56.23", "44.77")
}