import models.Address
import models.Bank
import models.Company
import models.Crypto
import models.Hair
import models.User

fun main() {

    val userList = mutableListOf<User>()

    userList.addAll(
        listOf(

            User(
                id = 1,
                firstName = "Rahim",
                lastName = "Ahmed",
                age = 25,
                email = "rahim@gmail.com",
                phone = "+8801710000001",
                birth = 1999,
                gender = "male",
                image = "",
                hair = Hair("Black", "Straight"),
                address = Address("Road 1", "Dhaka", "Dhaka", "1207", "Bangladesh"),
                company = Company("TechSoft", "Engineering", "Android Developer"),
                bank = Bank("12345678", "Visa", "BDT", "BD001"),
                crypto = Crypto("Bitcoin", "0xabc", "Ethereum"),
                role = "user"
            ),

            User(
                id = 2,
                firstName = "Karim",
                lastName = "Hossain",
                age = 30,
                email = "karim@gmail.com",
                phone = "+8801710000002",
                birth = 1994,
                gender = "male",
                image = "",
                hair = Hair("Brown", "Curly"),
                address = Address("Road 5", "Chittagong", "Chittagong", "4000", "Bangladesh"),
                company = Company("CodeLab", "Backend", "Software Engineer"),
                bank = Bank("87654321", "MasterCard", "BDT", "BD002"),
                crypto = Crypto("Ethereum", "0xdef", "ERC20"),
                role = "admin"
            ),

            User(
                id = 3,
                firstName = "Sadia",
                lastName = "Islam",
                age = 27,
                email = "sadia@gmail.com",
                phone = "+8801710000003",
                birth = 1997,
                gender = "female",
                image = "",
                hair = Hair("Black", "Wavy"),
                address = Address("Road 9", "Khulna", "Khulna", "9100", "Bangladesh"),
                company = Company("AppStudio", "Design", "UI Designer"),
                bank = Bank("23456789", "Visa", "BDT", "BD003"),
                crypto = Crypto("Bitcoin", "0xghi", "Ethereum"),
                role = "user"
            ),

            User(
                id = 4,
                firstName = "Tanvir",
                lastName = "Rahman",
                age = 28,
                email = "tanvir@gmail.com",
                phone = "+8801710000004",
                birth = 1996,
                gender = "male",
                image = "",
                hair = Hair("Gray", "Straight"),
                address = Address("Road 12", "Sylhet", "Sylhet", "3100", "Bangladesh"),
                company = Company("NextGen", "Mobile", "Kotlin Developer"),
                bank = Bank("34567890", "Visa", "BDT", "BD004"),
                crypto = Crypto("Solana", "0xjkl", "Solana"),
                role = "moderator"
            )
        )
    )

    for (user in userList) {

        println("ID: ${user.id}")
        println("Name: ${user.firstName} ${user.lastName}")
        println("Age: ${user.age}")
        println("Email: ${user.email}")
        println("Phone: ${user.phone}")
        println("Birth: ${user.birth}")
        println("Gender: ${user.gender}")

        println("Hair Color: ${user.hair.color}")
        println("Hair Type: ${user.hair.type}")

        println("City: ${user.address.city}")
        println("Country: ${user.address.country}")

        println("Company: ${user.company.name}")
        println("Department: ${user.company.department}")
        println("Title: ${user.company.title}")

        println("Bank Card: ${user.bank.cardNumber}")
        println("Currency: ${user.bank.currency}")

        println("Crypto Coin: ${user.crypto.coin}")
        println("Wallet: ${user.crypto.wallet}")

        println("Role: ${user.role}")

        println("-------------")

    }

}