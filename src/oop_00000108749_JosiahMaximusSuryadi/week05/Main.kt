package oop_00000108749_JosiahMaximusSuryadi.week05

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai){
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }

            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }

        println("-------------------------")
    }

    val mathHelper = MathHelper()

    val luasPersegi = mathHelper.hitungLuas(10)
    val luasPersegiPanjang = mathHelper.hitungLuas(10, 20)
    val luasLingkaran = mathHelper.hitungLuas(10.0)

    println("Luas Persegi: $luasPersegi, Luas Persegi Panjang: $luasPersegiPanjang, Luas Lingkaran: $luasLingkaran")

//    val eWallet = EWallet("Josiah", 50000.0)
//    val creditCard = CreditCard("Josiah", 100000.0)
//
//    val daftarPaymentMethod: List<PaymentMethod> = listOf(eWallet, creditCard)
//
//    for (PaymentMethod in daftarPaymentMethod) {
//        when(PaymentMethod) {
//            is EWallet -> eWallet.topUp(50000.0)
//        }
//
//        PaymentMethod.processPayment(75000.0)
//        println("Nama akun: ${PaymentMethod.accountName}")
//        println("Metode pembayaran: ${PaymentMethod.javaClass.simpleName}\n")
    }


}