package oop_00000108749_JosiahMaximusSuryadi.week06

import java.awt.Stroke

interface SmartDevice {
    val id: String
    val name: String
}

interface Switchable {
    abstract fun turnOn()
    abstract fun turnOff()
}

interface Recordable {
    abstract fun startRecord()
    fun stopRecord() {
        println("Perekaman dihentikan dan disimpan ke Cloud.")
    }
}