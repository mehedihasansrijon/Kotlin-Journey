package models

data class User(
    val id: Long,
    val firstName: String,
    val lastName: String,
    val age: Int,
    val gender: String,
    val birth: Int,
    val email: String,
    val phone: String,
    val image: String,
    val hair: Hair,
    val address: Address,
    val company: Company,
    val bank: Bank,
    val crypto: Crypto,
    val role: String
)