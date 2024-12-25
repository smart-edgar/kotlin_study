package edgar.study.kotlin.effective.chapter07.item47

typealias Seconds1 = Int
typealias Millis1 = Int

fun getTime(): Millis1 = 10
fun setUpTimer(time: Seconds1) {}

fun main() {
    val seconds: Seconds1 = 10
    val millis: Millis1 = seconds

    setUpTimer(getTime())
}
