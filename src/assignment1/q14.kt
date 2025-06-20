package assignment1

fun main() {
    val temp = 65

    val message = when {
        temp < 50 -> "Too Cold 🧊"
        temp in 50..70 -> "Perfect ☕"
        temp > 70 -> "Too Hot 🔥"
        else -> "Unknown Temp"
    }

    println("Coffee temperature is: $message")
}
