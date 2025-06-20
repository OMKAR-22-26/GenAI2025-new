package HOFs

fun divide(a: Int, b: Int): Int {
    return try {
        a / b
    } catch (e: ArithmeticException) {
        println("Error: ${e.message}")
        -1
    } finally {
        println("Execution done")
    }
}

fun main() {
    divide(10, 0)
}
