package assignment2

class CoffeeShop(val name: String) {
    fun printOpeningHours() {
        println("$name is open from 9 AM to 9 PM.")
    }
}

fun main() {
    val shop = CoffeeShop("Bean Brew")
    shop.printOpeningHours()
}
