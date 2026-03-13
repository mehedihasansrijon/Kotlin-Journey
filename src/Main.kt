fun main() {

    println("Give me day number")

    val dayNumber = readLine()?.toIntOrNull()

    val dayName = when (dayNumber) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Unknown day number"
    }

    println("Today is $dayName")
}