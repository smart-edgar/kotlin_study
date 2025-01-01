package edgar.study.kotlin.effective.chapter08.item49

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    numbers
        .filter { it % 10 == 0 } // 여기에서 컬렉션 하나
        .map { it * 2 } // 여기에서 컬렉션 하나
        .sum()

    numbers.asSequence()
        .filter { it % 10 == 0 }
        .map { it * 2 }
        .sum() // 컬렉션이 만들어지지 않습니다.
}
