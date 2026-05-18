package oop_00000108749_JosiahMaximusSuryadi.week13

import java.io.File

fun main() {
    println("=== TEST UNNSAFE RESOURCE HANDLES ===")
    val unsafeFile = File("unsafe_logs.txt")
    val writer = unsafeFile.printWriter()

    writer.println("Log 1: Membuka koneksi database...")
    writer.println("Log 1: Menulis data pengguna...")

    writer.close()
    println("Proses penulisan unsafe selesai.")

}