// DataClasses/Task2.kt
package dataClassesExercise2

data class AirlineTicket(
  val firstName: String,
  val lastName: String,
  val ticket: Int,
  val origin: String,
  val destination: String
)

fun AirlineTicket.transferTicket(
  otherFirstName: String,
  otherLastName: String
): AirlineTicket {
  return AirlineTicket(otherFirstName, otherLastName, ticket, origin, destination)
}

fun main() {
  val ticket = AirlineTicket("Bruce", "Eckel",
    123456, "DEN", "HND")
  println(ticket.transferTicket("Svetlana", "Isakova"))
}
/* Output:
AirlineTicket(firstName=Svetlana, lastName=Isakova, ticket=123456, origin=DEN, destination=HND)
*/