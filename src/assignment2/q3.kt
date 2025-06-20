package assignment2

data class CoffeeOrder(val type: String, val size: String)

fun main() {
    val order = CoffeeOrder("Espresso", "Medium")
    println("Order Summary: ${order.size} ${order.type}")
}
