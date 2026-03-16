package oop_00000108749_JosiahMaximusSuryadi.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon {
            val starterItem = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(starterItem, 50)
        }

        fun forgeEpicSword(): Weapon {
            val epicItem = GameItem("Pedang Listrik", 100, ItemRarity.EPIC)
            return Weapon(epicItem, 200)
        }
    }
}