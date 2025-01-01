package edgar.study.kotlin.effective.chapter08.item49


fun main() {
    val seq = sequenceOf(1, 2, 3)
    val filtered = seq.filter {
        println("f$it ")
        it % 2 == 1
    }
    println(filtered)

    val asList = filtered.toList()
    println(asList)

    val list = listOf(1, 2, 3)
    val filteredList = list.filter {
        println("f$it ")
        it % 2 == 1
    }
    println(filteredList)
}
