package HOFs
//map() transforms and returns new list.
//forEach()just iterates, no return.
fun main() {
    val words = listOf("one", "two", "three")

    val upper = words.map { it.uppercase() }
    println("Mapped to uppercase: $upper")

    println("Printing each item using forEach:")
    words.forEach { println(it) }
}
