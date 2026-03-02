package oop_00000108749_JosiahMaximusSuryadi.week05

import kotlin.math.PI

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance > amount){
            balance -= amount
            println("Pembayaran Sukses")
        } else {
            println("Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("TopUp $balance berhasil")
    }
}