package oop_00000108749_JosiahMaximusSuryadi.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.0))
    coinRepo.add(Coin("USDT", 1500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")
    response.data.forEach { coin -> println("Nama: ${coin.name} | Saldo: ${coin.balance}") }

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TX-001", 500.0))
    txRepo.add(Transaction("TX-002", 1250.5))
    txRepo.add(Transaction("TX-003", 75.0))

    val txResponse = ApiResponse("200 OK", txRepo.getAll())

    println("\nStatus: ${response.status}")
    txResponse.data.forEach { tx ->
        println("ID Transaksi: ${tx.name} | Jumlah: ${tx.amount}")
    }
}