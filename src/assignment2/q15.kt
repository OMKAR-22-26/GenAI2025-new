package assignment2

class Customer(var loyaltyPoints: Int) {
    fun addPoints(points: Int) {
        loyaltyPoints += points
        println("New loyalty points: $loyaltyPoints")
    }
}

fun main() {
    val customer = Customer(10)
    customer.addPoints(5)
}
