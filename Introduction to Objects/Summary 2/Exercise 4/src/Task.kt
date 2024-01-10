// Summary2/Task4.kt
package summaryIIExercise4
import atomictest.capture
import atomictest.eq
import java.lang.IllegalArgumentException

class Dictionary {
  private val _translations: MutableMap<String, MutableList<String>> = mutableMapOf()

  val translations
    get() = _translations

  fun addTranslations(word: String, translations: String) {
    if( _translations.containsKey(word)) {
      throw IllegalArgumentException("Dictionary already has translations for '$word'")
    }
    _translations[word] = translations.split(" ").toMutableList()

  }
}

fun main() {
  val dictionary = Dictionary()
  dictionary.addTranslations("apple", "Apfel")
  dictionary.addTranslations("cake", "Kuchen Torte")

  dictionary.translations eq mapOf("apple" to listOf("Apfel"),
    "cake" to listOf("Kuchen", "Torte"))

  capture {
    dictionary.addTranslations("cake", "Törtchen")
  } eq "IllegalArgumentException: Dictionary already has translations for 'cake'"

  // shouldn't compile:
//  dictionary.translations.remove("apple")
}