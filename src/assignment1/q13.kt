package assignment1

fun main() {
    val originalPrice = 200

    for (discount in 10..50 step 10) {
        val finalPrice = originalPrice * (1 - discount / 100.0)
        println("$discount% off: ₹${"%.2f".format(finalPrice)}")
    }
}
