package oop_00000108749_JosiahMaximusSuryadi.week05

class CreditCard (accountName: String, val limit: Double, var usedAmount: Double = 0.0) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (usedAmount + amount < limit){
            usedAmount += amount
            println("Pembayaran sukses")
        } else {
            println("Pembayaran gagal. Limit melebihi batas")
        }
    }
}