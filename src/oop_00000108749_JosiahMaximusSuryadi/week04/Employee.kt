package oop_00000108749_JosiahMaximusSuryadi.week04

open class Employee(val name: String, val baseSalary: Int){
    open fun work(){
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int = (baseSalary * 0.1).toInt()


}