package oop_00000108749_JosiahMaximusSuryadi.week03

class Player(val username: String) {
    private var xp: Int = 0

    val level: Int
        get() = (xp/100) + 1

    fun addXp(amount: Int) {
        if (amount > 0) {
            val levelSebelumnya = level
            xp += amount
            println("${username} mendapatkan $amount XP.")

            if (level > levelSebelumnya){
                println("Level Up! Selamat $username naik ke level $level")
            }
        } else {
            println("XP harus angka positif!")
        }
    }
}