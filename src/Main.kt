import models.Person
import models.personEcho

fun main() {
    val mehedihasan = Person("Mehedi Hasan Srijon", 2007, "Jannan Ali")
    personEcho(mehedihasan)

    val srijon = Person("Srijon", 2007, "Jannan Ali")
    personEcho(srijon)
}