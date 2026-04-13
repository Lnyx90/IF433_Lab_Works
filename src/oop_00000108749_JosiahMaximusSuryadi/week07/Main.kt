package oop_00000108749_JosiahMaximusSuryadi.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 23)
    println(reg1)
    println("Sama? ${reg1 == reg2}")

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1)
    println("Sama? ${data1 == data2}")

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1
    println("Destructured: $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

    val uiMessage = when(response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        is ApiResponse.Loading -> "Tampilkan Spinner"
    }

    println(uiMessage)

    println("\n=== TEST GAME ENGINE ===")
    GameManager.startGame()
    GameManager.startGame()

    println("\n=== DATA RARITY CHECK ===")
    println("Drop Chance untuk LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

    println("\n=== WEAPON FORGING ===")
    val starterWeapon = Weapon.forgeStarterSword()

    println("Detail Senjata Starter:")
    println("Nama       : ${starterWeapon.item.name}")
    println("Damage     : ${starterWeapon.item.damage}")
    println("Rarity     : ${starterWeapon.item.rarity}")
    println("Durability : ${starterWeapon.durability}")

    val upgradedWeapon = starterWeapon.item.copy(
        damage = 25
    )

    println("\n=== SIMULASI UPGRADE BLACKSMITH ===")
    println("Item lama: ${starterWeapon.item.name} (Damage: ${starterWeapon.item.damage})")
    println("Item baru: ${upgradedWeapon.name} (Damage: ${upgradedWeapon.damage})")

    println("\n=== LOG PERJALANAN PEMAIN ===")
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedWeapon))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}
