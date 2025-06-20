package assignment1

fun main() {
    val day = 3

    val recommendation = when (day) {
        1 -> "Try a chilled cold brew to start your week!"
        2 -> "Tuesday's pick: Vanilla latte!"
        3 -> "Midweek? Go for a strong espresso!"
        4 -> "Treat yourself to a caramel macchiato!"
        5 -> "Friday vibes call for mocha!"
        6 -> "Weekend special: Hazelnut cappuccino!"
        7 -> "Sunday brunch with a flat white!"
        else -> "Invalid day! Coffee knows no bounds though."
    }

    println(recommendation)
}
