package assignment1

fun main() {
    var stock = 10

    do {
        println("Coffee stock remaining: $stock")
        stock--
    } while (stock > 0)

    println("Out of stock!")
}
