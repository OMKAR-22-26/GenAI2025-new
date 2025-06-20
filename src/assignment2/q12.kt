package assignment2

data class CoffeeMenu(val items: List<String>) {
    fun printItems() {
        println("Menu Items:")
        items.forEach { println("- $it") }
    }
}

fun main() {
    val menu = CoffeeMenu(listOf("Espresso", "Latte", "Mocha"))
    menu.printItems()
}
