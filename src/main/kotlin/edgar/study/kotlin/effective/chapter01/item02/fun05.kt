package edgar.study.kotlin.effective.chapter01.item02

fun main() {
    var numbers = (2..100).toList()
    val primes = mutableListOf<Int>()
    while (numbers.isNotEmpty()) {
        val prime = numbers.first()
        primes.add(prime)
        numbers = numbers.filter { it % prime != 0 }
    }

    print(primes)
}
