package money_transfers

const val COMMISSION = 0.75
const val MIN_COMMISSION = 35
const val KOPECK = 100

fun main() {
    while (true) {
        print("Введите сумму перевода в рублях: ")
        val amountInKop = readln().toInt() * KOPECK
        val percentKop = amountInKop * COMMISSION / 100
        val percentRub = percentKop.toInt() / KOPECK

        val result = if (percentRub > MIN_COMMISSION) percentRub else MIN_COMMISSION
        println("Коммисия составит: $result руб.")
    }
}