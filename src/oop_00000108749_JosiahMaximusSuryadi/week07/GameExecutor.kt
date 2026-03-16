package oop_00000108749_JosiahMaximusSuryadi.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Ada monster: ${event.monsterName}!")
        }
        is BattleState.LootDropped -> {
            val item = event.item
            println("Kamu dapat: ${item.name}, Rarity: ${item.rarity}")
        }
        is BattleState.GameOver -> {
            println("Game Over: ${event.reason}")
        }
        BattleState.SafeZone -> {
            println("Kamu aman dari monster.")
        }
    }
}