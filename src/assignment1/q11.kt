package assignment1

fun main() {
    var strength = 0

    while (strength < 80) {
        println("Brewing... strength at $strength")
        strength += 20
    }

    println("Coffee is ready with strength $strength!")
}
