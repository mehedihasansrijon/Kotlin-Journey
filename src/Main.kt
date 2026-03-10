fun main() {
    val balance = 81673 // Balance for this user
    val withdrawAmount = 23500 // Withdraw amount for this user
    val dailyLimit = 50000 // Daily limit

    if (withdrawAmount <= 0) {
        result("Invalid withdrawal amount") // Invalid withdrawal amount
    } else if (withdrawAmount > dailyLimit) {
        result("Daily withdrawal limit exceeded") // Daily withdrawal limit exceeded
    } else if (withdrawAmount % 500 != 0) {
        result("ATM can dispense only 500 or 1000 multiples") // ATM can dispense only 500 or 1000 multiples
    } else if (withdrawAmount > balance) {
        result("Insufficient balance") // Balance is Insufficient balance
    } else {
        val remainingBalance = balance - withdrawAmount // Balance remaining

        val oneThousand = withdrawAmount / 1000 // One thousand notes count
        val remaining = withdrawAmount % 1000
        val fiveHundredNotes = remaining / 500 // five Handed notes count

        result(
            "Withdrawal successful\n" + "Remaining balance: ${remainingBalance}\nNotes:\n1000 * $oneThousand\n500 * $fiveHundredNotes"
        )
    }
}

// Result showing method
fun result(value: String) {
    println(value)
}