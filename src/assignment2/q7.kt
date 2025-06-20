package assignment2

fun prepareCoffee(sugarLevel: Int = 1) {
    println("Preparing coffee with $sugarLevel spoon(s) of sugar.")
}

fun main() {
    prepareCoffee()
    prepareCoffee(2)
}
