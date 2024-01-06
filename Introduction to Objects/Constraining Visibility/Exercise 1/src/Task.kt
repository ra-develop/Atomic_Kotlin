// Visibility/Task1.kt
package constrainingVisibilityExercise1

class Alien( val name: String,  val species: String, private var planet: String) {
  fun movePlanet(to: String) {
    planet = to
  }

  override fun toString(): String {
    return "Alien $name, $species: $planet"
  }
}

fun main() {
  val a1 = Alien("Arthricia", "Cat Person", "PurgePlanet")
  println(a1)
  a1.movePlanet("Earth C-137")
  println(a1)

  val a2 = Alien("Dale", "Giant", "Gearworld")
  println(a2)
  a2.movePlanet("Parblesnops")
  println(a2)
}
/* Expected output:
Alien Arthricia, Cat Person: PurgePlanet
Alien Arthricia, Cat Person: Earth C-137
Alien Dale, Giant: Gearworld
Alien Dale, Giant: Parblesnops
*/