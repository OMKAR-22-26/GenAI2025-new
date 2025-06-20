package HOFs

fun applyTwice(x: Int, op: (Int) -> Int): Int {
    return op(op(x))
}

fun main() {
    val result = applyTwice(3) { it + 1 }  // (3 + 1) + 1 = 5
    println("Result: $result")
}
