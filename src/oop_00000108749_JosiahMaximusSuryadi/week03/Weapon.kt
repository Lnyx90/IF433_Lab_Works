package oop_00000108749_JosiahMaximusSuryadi.week03

class Weapon(val name: String){
    var damage: Int = 0
        set(value) {
            when{
                value < 0 -> {
                    println("Peringatan: Damage tidak boleh negatif! Nilai tetap $field")
                }
             value > 1000 -> {
                 field = 1000
                 println("Peringatan: Damage $name terlalu OP! Dipaksa menjadi 1000.")
             } else -> field = value
            }
        }

    val tier: String
        get() =  when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Commin"
        }
}