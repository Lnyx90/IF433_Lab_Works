package oop_00000108749_JosiahMaximusSuryadi.week10

interface UI {
    val name: String
}

class WalletRepository<T> where T : UI, T : Any {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items.toList()
    }

    fun findByName(name: String): T? {
        return items.find { it.name.equals(name, true) }
    }
}