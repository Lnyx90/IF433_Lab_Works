package oop_00000108749_JosiahMaximusSuryadi.week02

import java.util.Scanner

fun main() {
//    val scanner = Scanner(System.`in` )
//
//    println("--- APLIKASI PMB UMN ---")
//
//    print("Masukkan Nama: ")
//    val name =  scanner.nextLine()
//
//    print("Masukkan NIM (Wajib 5 Karakter): ")
//    val nim = scanner.next()
//
//    scanner.nextLine()
//
//    if (nim.length != 5){
//        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
//    } else {
//        print("Masukkan Jurusan: ")
//        val major = scanner.nextLine()
//
//        val s1 = Student(name, nim, major)
//        println("Status: Pendaftaran Selesai.")
//    }
//
//    if (nim.length != 5) {
//        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
//    } else {
//        print("Pilih Jalur (1. Reguler, 2. Umum): ")
//        val type = scanner.nextInt()
//        scanner.nextLine()
//
//        if (type == 1) {
//            print("Masukkan Jurusan: ")
//            val major = scanner.nextLine()
//            val s1 = Student(name, nim, major) // Primary [cite: 84]
//            println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
//        } else if (type == 2) {
//            val s2 = Student(name, nim) // Secondary [cite: 87]
//            println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
//        } else {
//            println("Pilihan ngawur, pendaftaran batal!")
//        }
//    }


//    val scanner = Scanner(System.`in`)
//
//    println("--- Sistem Peminjaman Buku ---")
//
//    print("Masukkan Judul Buku: ")
//    val title = scanner.nextLine()
//
//    print("Masukkan Nama Peminjam: ")
//    val borrower = scanner.nextLine()
//
//    print("Masukkan Lama Pinjam (hari): ")
//    var duration = scanner.nextInt()
//
//    if (duration < 0) {
//        println("Invalid input: Durasi tidak boleh minus. Otomatis diatur ke 1 hari.")
//        duration = 1
//    }
//
//    val loan = Loan(title, borrower, duration)
//
//    println("\n--- DETAIL PEMINJAMAN ---")
//    println("Judul Buku    : ${loan.bookTitle}")
//    println("Peminjam      : ${loan.borrower}")
//    println("Durasi Pinjam : ${loan.loanDuration} hari")
//    println("Total Denda   : Rp ${loan.calculateFine()}")


    val scanner = Scanner(System.`in`)

    println("\n--- Persiapan Battle ---")

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val damage = scanner.nextInt()

    val myHero = Hero(heroName, damage)

    var enemyHp = 100

    while (myHero.isAlive() && enemyHp > 0) {
        println("HP ${myHero.name}: ${myHero.hp} | HP Musuh: $enemyHp")
        println("Menu: 1. Serang, 2. Kabur")
        print("Pilih aksi: ")

        when (scanner.nextInt()) {
            1 -> {
                myHero.attack("Monster")
                enemyHp -= myHero.baseDamage
                if (enemyHp < 0) enemyHp = 0
                println("HP Musuh tersisa: $enemyHp")

                if (enemyHp > 0) {
                    val enemyAtk = (10..20).random()
                    println("Monster membalas dengan $enemyAtk damage!")
                    myHero.takeDamage(enemyAtk)
                    println("HP ${myHero.name} tersisa: ${myHero.hp}")
                }
            }
            2 -> {
                println("${myHero.name} memilih kabur dari medan tempur!")
                break
            }
            else -> println("Aksi tidak valid!")
        }
    }

    if (!myHero.isAlive()) {
        println("Kalah! ${myHero.name} telah gugur.")
    } else if (enemyHp <= 0) {
        println("MENANG! Monster berhasil dikalahkan oleh ${myHero.name}.")
    } else {
        println("Pertarungan berakhir tanpa pemenang (Kabur).")
    }
}