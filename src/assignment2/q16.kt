package assignment2

fun isValidCoffee(coffeeType: String?): Boolean {
    val validTypes = listOf("Latte", "Espresso", "Cappuccino")
    return coffeeType != null && coffeeType in validTypes
}

fun main() {
    val coffeeType: String? = "Latte"
    println("Is valid: ${isValidCoffee(coffeeType)}")
}
