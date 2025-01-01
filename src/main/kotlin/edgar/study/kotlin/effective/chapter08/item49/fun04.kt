package edgar.study.kotlin.effective.chapter08.item49

fun main() {
    (1..10).asSequence()
        .filter { it % 2 == 1 }
        .map { it * 2 }
        .find { it > 5 }

    (1..10)
        .filter { it % 2 == 1 }
        .map { it * 2 }
        .find { it > 5 }
}
