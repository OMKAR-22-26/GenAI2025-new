package HOFs

fun readElementAtIndex(list: List<String>, index: Int) {
    try {
        println("Element at $index: ${list[index]}")
    } catch (e: IndexOutOfBoundsException) {
        println("Error: ${e.message}")
    }
}

fun main() {
    val names = listOf("Alice", "Bob")
    readElementAtIndex(names, 5)
}
