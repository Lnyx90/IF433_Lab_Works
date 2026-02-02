package oop_00000108749_JosiahMaximusSuryadi.week01

import java.awt.geom.Area
import java.lang.classfile.constantpool.DoubleEntry

fun main(args: Array<String>){
    val radius = 7.0
    val pi = 3.14

    val area = pi * radius * radius

    println("Radius: $radius, Area: $area")


}

fun checkSize(area: Double) {
    if (area > 100) {
        println("This is a Big Circle")
    } else {
        println("This is a Small Circle")
    }
}