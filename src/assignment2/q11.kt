package assignment2

fun getPrice(size: String?): Double {
    return when (size?.lowercase()) {
        "small" -> 50.0
        "medium" -> 80.0
        "large" -> 100.0
        else -> 0.0
    }
}

fun main() {
    val size: String? = "Medium"
    println("Price: ₹${getPrice(size)}")
}
