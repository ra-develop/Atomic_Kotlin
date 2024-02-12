// Sequences/Task4.kt
package sequencesExercise4

fun School.favoriteInstructor(student: Student): Instructor? =
  lessons.filter {
    student in it.students.asSequence()
  }.groupBy {
    it.instructor
  }.asSequence().sortedByDescending {
    it.value.size
  }.firstOrNull()?.key