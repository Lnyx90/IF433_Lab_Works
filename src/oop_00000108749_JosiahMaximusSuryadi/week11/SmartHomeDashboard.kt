package oop_00000108749_JosiahMaximusSuryadi.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice().apply {
        name = "Philips Wiz Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }. also {
        homeDevices.add(it)
    }
}