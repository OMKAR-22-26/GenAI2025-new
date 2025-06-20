package assignment2

data class Barista(val name: String, val favoriteCoffee: String?)

fun main() {
    val barista = Barista("Arya", null)
    println("${barista.name}'s favorite: ${barista.favoriteCoffee ?: "Not specified"}")
}
