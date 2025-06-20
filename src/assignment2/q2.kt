package assignment2

fun main() {
    val quantity = 2
    val pricePerCup: Double? = 80.0

    val total = quantity * (pricePerCup ?: 0.0)
    println("Total Price: ₹$total")
}
