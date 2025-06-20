package assignment2

fun main() {
    val prices = listOf(120.0, 150.0, 100.0)
    val highest = prices.maxOrNull()
    println("Highest Price: ₹$highest")
}
