package HOFs

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)

    // Built-in filter
    val evens1 = numbers.filter { it % 2 == 0 }
    println("Even numbers (filter): $evens1")

    // Custom HOF
    fun customFilter(list: List<Int>, condition: (Int) -> Boolean): List<Int> {
        val result = mutableListOf<Int>()
        for (num in list) {
            if (condition(num)) result.add(num)
        }
        return result
    }

    val evens2 = customFilter(numbers) { it % 2 == 0 }
    println("Even numbers (custom): $evens2")
}
