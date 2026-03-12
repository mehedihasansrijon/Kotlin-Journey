package models

data class Bank(
    val cardNumber: String,
    val cardType: String,
    val currency: String,
    val iban: String
)