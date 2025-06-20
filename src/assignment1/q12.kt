package assignment1

fun main() {
    val price = 120

    val category = when {
        price < 50 -> "Budget Brew"
        price in 50..150 -> "Mid-range Mug"
        else -> "Premium Pour"
    }

    println("This is a $category ☕")
}
