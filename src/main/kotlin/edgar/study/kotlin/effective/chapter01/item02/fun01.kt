package edgar.study.kotlin.effective.chapter01.item02

val a = 1
fun fizz() {
    val b = 2
    println(edgar.study.kotlin.effective.chapter01.item02.a + b)
}
val buzz = {
    val c = 3
    println(edgar.study.kotlin.effective.chapter01.item02.a + c)
}

fun main() {
    edgar.study.kotlin.effective.chapter01.item02.fizz()
    edgar.study.kotlin.effective.chapter01.item02.buzz
}
