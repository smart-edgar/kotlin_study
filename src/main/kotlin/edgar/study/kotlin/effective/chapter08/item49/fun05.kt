package edgar.study.kotlin.effective.chapter08.item49

fun main() {
    val fibonacci = sequence {
        yield(1)
        var current = 1
        var prev = 1
        while (true) {
            yield(current)
            val temp = prev
            prev = current
            current += temp
        }
    }

    println(fibonacci.take(10).toList())
}
