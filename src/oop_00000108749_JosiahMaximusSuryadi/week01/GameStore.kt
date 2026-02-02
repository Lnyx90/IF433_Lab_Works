package oop_00000108749_JosiahMaximusSuryadi.week01

import kotlin.math.roundToInt

fun main(){
    val gameTitle = "Game"
    val price = 1000000

    printReceipt(finalPrice = calculateDiscount(price), title = "$gameTitle")
}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.8).toInt() else (price * 0.9).toInt()

fun printReceipt(title: String, finalPrice: Int){
    val userNote: String? = null

    println("Judul: $title")
    println("Harga Akhir: $finalPrice")
    println("Catatan: ${userNote ?: "Tidak ada catatan"}")
}

//