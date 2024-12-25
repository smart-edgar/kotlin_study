package edgar.study.kotlin.effective.chapter07.item45

import java.math.BigInteger

private val FIB_CACHE = mutableMapOf<Int, BigInteger>()

fun fib(n: Int): BigInteger = FIB_CACHE.getOrPut(n) {
    if (n <= 1) BigInteger.ONE else fib(n - 1) + fib(n - 2)
}

fun fibIter(n: Int): BigInteger {
    if (n <= 1) return BigInteger.ONE

    var p = BigInteger.ONE
    var pp = BigInteger.ONE
    for (i in 2..n) {
        val temp = p + pp
        pp = p
        p = temp
    }

    return p
}
