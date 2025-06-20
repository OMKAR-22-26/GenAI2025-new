package assignment2

fun main() {
    val coffees = listOf("Espresso", "Cappuccino", "Latte", "Cold Brew")
    val filtered = coffees.filter { it.startsWith("C") }
    println("Coffees starting with 'C': $filtered")
}
