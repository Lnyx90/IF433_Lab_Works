package oop_00000108749_JosiahMaximusSuryadi.week13
import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(val id: Int, val symbol: String, val type: String, val margin: Double, val pnl: Double)

fun TradeRecord.toCsv(): String {
    return "$id,$symbol,$type,$margin,$pnl"
}

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")

        TradeRecord(parts[0].trim().toInt(), parts[1].trim(), parts[2].trim(), parts[3].trim().toDouble(), parts[4].trim().toDouble())
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("(Log) File tidak ditemukan: $path")
        emptyList()
    }
}

fun main() {
    val filePath = "crypto_trades.csv"

    val mockTrades = listOf(
        TradeRecord(1, "BTCUSDT", "Long", 0.5, 150.0),
        TradeRecord(2, "ETHUSDT", "Short", 2.0, -50.0),
        TradeRecord(3, "SOLUSDT", "Long", 10.0, 75.5)
    )
    saveTrades(mockTrades, filePath)

    File(filePath).appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")

    val loadedData = loadTrades(filePath)
    val totalPnl = loadedData.sumOf { it.pnl }

    println("\n=== DAFTAR TRANSAKSI VALID ===")
    loadedData.forEach { trade ->
        println("ID: ${trade.id} | ${trade.symbol} (${trade.margin}) | PnL: ${trade.pnl}")
    }
    println("\n=== TOTAL PnL BERSIH: $totalPnl ===")
}