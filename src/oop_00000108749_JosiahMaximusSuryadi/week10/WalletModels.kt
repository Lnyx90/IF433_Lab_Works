package oop_00000108749_JosiahMaximusSuryadi.week10

data class Coin(override val name: String, val balance: Double) : UI

data class Transaction(val id: String, val amount: Double) : UI {
    override val name: String = id
}