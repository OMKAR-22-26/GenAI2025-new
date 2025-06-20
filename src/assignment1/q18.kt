package assignment1

import kotlin.random.Random

fun main() {
    val tipNumber = Random.nextInt(1, 5)

    val tip = when (tipNumber) {
        1 -> "Always tip your barista!"
        2 -> "Espresso is best enjoyed freshly pulled."
        3 -> "Latte art is coffee’s love language."
        4 -> "Try something new today – maybe a mocha?"
        else -> "Keep sipping!"
    }

    println("Coffee Tip: $tip")
}
