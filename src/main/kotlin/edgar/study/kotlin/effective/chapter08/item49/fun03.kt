package edgar.study.kotlin.effective.chapter08.item49

fun main() {
    sequenceOf(1, 2, 3)
        .filter {
            println("F$it ")
            it % 2 == 1
        }
        .map {
            println("M$it ")
            it * 2
        }
        .forEach {
            println("E$it ")
        }

    println("=======")

    listOf(1, 2, 3)
        .filter {
            println("F$it ")
            it % 2 == 1
        }
        .map {
            println("M$it ")
            it * 2
        }
        .forEach {
            println("E$it ")
        }
}
