package oop_00000108749_JosiahMaximusSuryadi.week09

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    println("Original Data: $numbers")
    println("\n=== HOF: Filter ===")
    val evens = numbers.filter { it % 2 == 0 }
    println("Evens only: $evens")
}