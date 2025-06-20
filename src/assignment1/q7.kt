package assignment1

fun main() {
    for (price in 1..10) {
        if (price % 2 == 0) {
            println("₹$price coffee – even better deal!")
        }
    }
}
