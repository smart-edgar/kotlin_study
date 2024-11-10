package edgar.study.kotlin.effective.item01

fun main() {
    val list = listOf(1, 2, 3)

    val mutableList = list.toMutableList()
    mutableList.add(4)
}
