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

    val acDevice = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(acDevice)

    homeDevices.add(
        SmartDevice(
            name = "Picolo's Auto Feeder",
            category = "Pet Care",
            isOnline = true,
            powerLoad = 10
        )
    )

    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let { device ->
        println(device.diagnose())
    }

    with(homeDevices) {
        println("=== Rangkuman ===")
        println("Jumlah perangkat: ${this.size}")
        println("Daftar Perangkat:")
        this.forEachIndexed { index, device ->
            println("${index + 1}. ${device.name} (${device.category})")
        }
    }

    val totalPower = homeDevices.run {
        sumOf { it.powerLoad }
    }
    println("=== Kalkulasi Total Daya ===")
    println("Total Daya: $totalPower W")
}