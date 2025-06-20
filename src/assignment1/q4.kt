package assignment1

fun main() {
    var size1 = "Small"
    var size2 = "Large"

    println("Before swapping: size1 = $size1, size2 = $size2")

    val temp = size1
    size1 = size2
    size2 = temp

    println("After swapping: size1 = $size1, size2 = $size2")
}
