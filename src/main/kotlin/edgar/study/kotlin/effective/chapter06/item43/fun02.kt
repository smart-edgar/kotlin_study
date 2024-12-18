package edgar.study.kotlin.effective.chapter06.item43

open class C
class D: C()
fun C.foo() = "c"
fun D.foo() = "d"

fun main() {
    val d = D()
    println(d.foo())
    val c: C = d
    println(c.foo())

    println(D().foo())
    println((D() as C).foo())
}
