package edgar.study.kotlin.effective.chapter01.item05

fun factorial(n: Int): Long {
    require(n >= 0) { "Cannot calculate factorial of $n because it is smaller than 0" }
    return if (n <= 1) 1 else edgar.study.kotlin.effective.chapter01.item05.factorial(n - 1) * n
}
