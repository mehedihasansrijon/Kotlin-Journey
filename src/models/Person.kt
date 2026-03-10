package models

data class Person(
    val name: String,
    val birthYear: Int,
    val fatherName: String
)

fun personEcho(person: Person) {
    println(
        """Name: ${person.name}
        |Birth Year: ${person.birthYear}
        |Father Name: ${person.fatherName}
    """.trimMargin()
    )
}
