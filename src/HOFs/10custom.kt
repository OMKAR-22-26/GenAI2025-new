package HOFs

class NegativeNumberException(message: String) : Exception(message)

fun checkPositive(number: Int) {
    if (number < 0) {
        throw NegativeNumberException("Negative numbers are not allowed: $number")
    } else {
        println("Number is positive: $number")
    }
}

fun main() {
    try {
        checkPositive(-7)
    } catch (e: NegativeNumberException) {
        println("Caught: ${e.message}")
    }
}
