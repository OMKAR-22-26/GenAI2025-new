package assignment2

fun main() {
    val coffeePrices = mapOf("Espresso" to 90.0, "Latte" to 120.0, "Mocha" to 100.0)
    val expensive = coffeePrices.maxByOrNull { it.value }
    println("Most Expensive: ${expensive?.key} @ ₹${expensive?.value}")
}
