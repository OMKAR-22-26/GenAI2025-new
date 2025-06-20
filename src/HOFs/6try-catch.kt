package HOFs

fun main() {
    try {
        val number = "abc".toInt()
        println("Number: $number")
    } catch (e: NumberFormatException) {
        println("Error: '${e.message}' — Input was not a valid number.")
    }
}
