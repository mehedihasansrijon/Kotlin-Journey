import models.Person

fun main() {
    val person = Person("Mehedi Hasan Srijon", 2007, "Jannan Ali")

    println("Name: ${person.name}")
    println("Birthyear: ${person.birthYear}")
    println("Father Name: ${person.fatherName}")
}