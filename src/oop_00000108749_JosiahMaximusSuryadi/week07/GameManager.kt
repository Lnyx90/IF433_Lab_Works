package oop_00000108749_JosiahMaximusSuryadi.week07

object GameManager {
    var isGamingRunning: Boolean = false

    fun startGame() {
        if (isGamingRunning) {
            println("Game sudah berjalan!")
        } else {
            println("Memulai Game Engine...")
        }
    }
}