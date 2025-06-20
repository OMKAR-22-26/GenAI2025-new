package assignment2

fun main() {
    val prices = listOf(100.0, 120.0, 80.0)
    val discounted = prices.map { it * 0.9 }
    println("Discounted Prices: $discounted")
}
