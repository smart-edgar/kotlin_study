package edgar.study.kotlin.effective.item05

fun factorial(n: Int): Long {
    require(n >= 0) { "Cannot calculate factorial of $n because it is smaller than 0" }
    return if (n <= 1) 1 else factorial(n - 1) * n
}
