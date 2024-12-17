package edgar.study.kotlin.effective.chapter06.item40

data class FullName(val name: String, val surname: String)

fun ex_40_01() {
    val name1 = FullName("A", "1")
    val name2 = FullName("B", "2")
    val name3 = FullName("C", "3")

    name1 == name1
    name1 == name2
    name1 == name3

    name1 === name1
    name1 === name2
    name1 === name3

}

