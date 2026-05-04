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

    SmartDevice(
        name = "Ezviz Outdoor",
        category = "Camera"
    ).apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }
}