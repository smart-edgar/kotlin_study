package edgar.study.kotlin.effective.chapter02.item12

fun Int.factorial(): Int = (1..this).product()

fun Iterable<Int>.product(): Int =
    fold(1) {
        acc, elem -> acc * elem
    }

fun ex1() {
    //수학식 10 & 6!
    println(10 * 6.factorial()) // 7200
}


operator fun Int.not() = factorial()

fun ex2() {
    println(10 * !6) // 7200
}

fun ex3() {
    // x + y == z
    // x.plus(y).equal(z)
    // (x.plus(y))?.equal(z) ?: (z == null)
}
