import models.Member
import kotlin.collections.mutableListOf
import kotlin.contracts.Returns

fun main() {
    team()
}

fun team() {
    val memberList = mutableListOf<Member>()

    addMember(memberList, "Srijon", 22)
    addMember(memberList, "Rahim", 25)
    addMember(memberList, "Karim", 30)
    printTeam(memberList)
}

fun addMember(mutableList: MutableList<Member>, name: String, age: Int) {
    mutableList.add(Member(name, age))
}

fun printTeam(mutableList: MutableList<Member>) {
    for (member in mutableList) {
        println("Name: ${member.name}, Age: ${member.age}\n")
    }
}