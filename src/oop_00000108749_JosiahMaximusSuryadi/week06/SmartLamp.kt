package oop_00000108749_JosiahMaximusSuryadi.week06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOff() {
        println("Mati")
    }

    override fun turnOn() {
        println("Nyala")
    }
}