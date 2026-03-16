package oop_00000108749_JosiahMaximusSuryadi.week07

import java.net.URL

class NetworkClient private  constructor(val url:  String){
    companion object {
        const val BASE_URL = "https://api.umn.ac.id"

        fun createClient(): NetworkClient{
            println("Membangun NetworkClient dengan BASE_URL: $BASE_URL")
            return NetworkClient(BASE_URL)
        }
    }

    fun connect () {
        println("Connecting to $url...")
    }
}