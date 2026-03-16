package oop_00000108749_JosiahMaximusSuryadi.week07

object GameManager {
    var isGamingRunning: Boolean = false

    fun startGame() {
        if (isGamingRunning) {
            println("Game sudah berjalan! Mencegah inisiasi ganda.")
        } else {
            isGamingRunning = true
            println("Memulai Game Engine...")
        }
    }
}