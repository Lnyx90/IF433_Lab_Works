package oop_00000108749_JosiahMaximusSuryadi.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)

    val myLamp = SmartLamp("L1", "Ruang Tamu")
    val mySpeaker = SmartSpeaker("S1", "Google Nest Dapur")
    val myCCTV = SmartCCTV("C1", "Ezviz Garasi")


}