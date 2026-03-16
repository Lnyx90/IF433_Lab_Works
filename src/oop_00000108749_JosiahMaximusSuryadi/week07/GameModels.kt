package oop_00000108749_JosiahMaximusSuryadi.week07

enum class ItemRarity(val dropChance: Int) {
    COMMON(70), UNCOMMON(10), RARE(5), EPIC(3), LEGENDARY(1)
}

data class GameItem(
    val name: String,
    val damage: Int,
    val rarity: ItemRarity
)