package HOFs

fun operateOnList(numbers: List<Int>, operation: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for (num in numbers) {
        result.add(operation(num))
    }
    return result
}

fun main() {
    val original = listOf(1, 2, 3)
    val doubled = operateOnList(original) { it * 2 }
    println("Doubled list: $doubled")
}
