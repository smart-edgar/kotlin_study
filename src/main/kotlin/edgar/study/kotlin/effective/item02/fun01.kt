package edgar.study.kotlin.effective.item02

val a = 1
fun fizz() {
    val b = 2
    println(a + b)
}
val buzz = {
    val c = 3
    println(a + c)
}

fun main() {
    fizz()
    buzz
}
