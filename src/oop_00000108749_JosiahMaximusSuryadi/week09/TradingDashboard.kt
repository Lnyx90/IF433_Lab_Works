package oop_00000108749_JosiahMaximusSuryadi.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", -10, 25.0, "OPEN"),
        TradeLog("BTCUSDT", "SHORT", 50, -10.0, "CLOSED"),
        TradeLog("DOTUSDT", "LONG", 50, 8.4, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 20, -2.1,  "OPEN"),
        TradeLog("BNBUSDT", "SHORT", 15, 12.0,  "CLOSED")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }


}