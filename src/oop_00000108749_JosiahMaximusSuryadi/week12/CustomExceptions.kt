package oop_00000108749_JosiahMaximusSuryadi.week12

class InsufficientFundsException(val amount: Double, val balance: Double) : Exception("Attempted $amount, balance: $balance")

