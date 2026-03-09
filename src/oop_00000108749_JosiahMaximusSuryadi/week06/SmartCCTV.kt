package oop_00000108749_JosiahMaximusSuryadi.week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {

    override fun startRecord() {
    }

    override fun turnOn() {
        startRecord()
    }

    override fun turnOff() {
        stopRecord()
    }
}