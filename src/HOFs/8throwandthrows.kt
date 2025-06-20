package HOFs

//throw is used to throw an exception
//throws is used to mention exceptions in Java interop.
//throws is used rarely.

class LoginFailedException(message: String) : Exception(message)

fun login(user: String, password: String) {
    if (password != "secret") {
        throw LoginFailedException("Login failed for user $user")
    }
}

fun main() {
    try {
        login("john", "wrongpass")
    } catch (e: LoginFailedException) {
        println("Caught exception: ${e.message}")
    }
}
