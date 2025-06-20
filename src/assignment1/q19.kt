package assignment1

fun main() {
    for (order in 1..10) {
        if (order == 5) {
            println("Rush hour! Too many orders ☕🚨")
            break
        }
        println("Processing order #$order")
    }
}
