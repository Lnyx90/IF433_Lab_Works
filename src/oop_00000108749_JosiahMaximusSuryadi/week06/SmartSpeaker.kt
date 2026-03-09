package oop_00000108749_JosiahMaximusSuryadi.week06

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable  {
    override fun turnOff() {
        println("Mati")
    }

    override fun turnOn() {
        println("Nyala")
    }

    fun playMusic(song: String) {
        println("Memutar lagi $song dari Spotify.")
    }
}