package oop_00000108749_JosiahMaximusSuryadi.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}