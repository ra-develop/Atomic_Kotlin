// Sets/Task3.kt
package setsExercise3
import atomictest.eq

val meats = setOf("beef", "chicken")
val fruits = setOf("apple", "orange", "banana", "kiwi")
val vegetables = setOf("beans", "peas", "carrots", "sweet potatoes", "asparagus", "spinach")

// countPercent
fun countPercent(value:Int, base: Int): Double = value * 100.0 / base

fun percentMeat(groceryCart: Set<String>): Double =
  countPercent((groceryCart intersect meats).size, groceryCart.size)

fun percentFruit(groceryCart: Set<String>): Double =
  countPercent((groceryCart intersect fruits).size, groceryCart.size)

fun percentVeggies(groceryCart: Set<String>): Double =
  countPercent((groceryCart intersect vegetables).size, groceryCart.size)

fun percentOther(groceryCart: Set<String>): Double =
  countPercent((groceryCart - fruits - meats - vegetables).size, groceryCart.size)

fun main() {
  val groceryCart = setOf("apple", "pretzels", "bread", "orange", "beef",
    "beans", "asparagus", "sweet potatoes", "spinach", "carrots")

  percentMeat(groceryCart) eq 10.0
  percentFruit(groceryCart) eq 20.0
  percentVeggies(groceryCart) eq 50.0
  percentOther(groceryCart) eq 20.0
}