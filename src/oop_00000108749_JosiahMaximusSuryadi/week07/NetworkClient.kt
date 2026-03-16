package oop_00000108749_JosiahMaximusSuryadi.week07

import java.net.URL

class NetworkClient private  constructor(val url:  String){
    fun connect () {
        println("Connecting to $url")
    }
}