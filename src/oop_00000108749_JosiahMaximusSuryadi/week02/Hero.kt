package oop_00000108749_JosiahMaximusSuryadi.week02

class Hero (val name: String, val baseDamage: Int, var hp: Int = 100) {
    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        this.hp -= damage
        if (this.hp < 0) this.hp = 0
    }

    fun isAlive(): Boolean = hp > 0
}