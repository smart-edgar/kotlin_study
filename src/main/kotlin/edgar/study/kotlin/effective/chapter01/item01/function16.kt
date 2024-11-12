package edgar.study.kotlin.effective.chapter01.item01

fun main() {
    val list1: MutableList<Int> = mutableListOf()
    var list2: List<Int> = listOf()

    list1.add(1)
    list2 = list2 + 1

    list1 += 2
    list2 += 2

    println("list1: $list1")
    println("list2: $list2")
}
