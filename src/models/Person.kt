package models

data class Person(
    val name: String, val birthYear: Int, val fatherName: String
) {
    fun echo() {
        println(
            """Name: ${name}
        |Birth Year: ${birthYear}
        |Father Name: ${fatherName}
    """.trimMargin()
        )
    }
}
