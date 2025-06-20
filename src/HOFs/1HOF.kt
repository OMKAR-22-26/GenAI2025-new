package HOFs

// An hof takes other function as a parameter or returns one.
//Example
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun main() {
    val sum = calculate(5, 3) { a, b -> a + b }
    println("Sum: $sum")
}
