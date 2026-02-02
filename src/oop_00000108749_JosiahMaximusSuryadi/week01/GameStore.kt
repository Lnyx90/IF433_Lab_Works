package oop_00000108749_JosiahMaximusSuryadi.week01

import kotlin.math.roundToInt

fun main(){
    val gameTitle = "Game"
    val price = 1000000

    printReceipt(finalPrice = price, title = "$gameTitle")
}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.8).roundToInt() else (price * 0.9).roundToInt()

fun printReceipt(title: String, finalPrice: Int){
    println("Judul: $title")
    println("Harga Akhir: $finalPrice")
}