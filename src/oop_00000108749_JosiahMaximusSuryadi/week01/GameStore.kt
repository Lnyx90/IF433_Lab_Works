package oop_00000108749_JosiahMaximusSuryadi.week01

import kotlin.math.roundToInt

fun main(){
    val gameTitle = "Game"
    val price = 1000000

    println("${calculateDiscount(price)}")
}

fun calculateDiscount(price: Int) = if (price > 500000) (price * 0.8).roundToInt() else price

