// Constructors/Scientist.kt

class Scientist(val name: String) {
  override fun toString(): String {
    return "Scientist('$name')@${super.toString().substringAfter('@')}"
  }
}

fun main() {
  val zeep = Scientist("Zeep Xanflorp")
  println(zeep)
}
/* Output:
Scientist('Zeep Xanflorp')
*/