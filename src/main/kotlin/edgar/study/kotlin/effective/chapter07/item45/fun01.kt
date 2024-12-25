package edgar.study.kotlin.effective.chapter07.item45

fun main() {
    ex45_01()
    ex45_02()
    ex45_03()
}

fun ex45_01() {
    val str1 = "Lorem ipsum dolor sit amet"
    val str2 = "Lorem ipsum dolor sit amet"
    println(str1 == str2)
    println(str1 === str2)
}

fun ex45_02() {
    val i1: Int? = 1
    val i2: Int? = 1

    println(i1 == i2)
    println(i1 === i2)
}


// 왜 ===에서 Int 는 true고 Int? 는 false 일까?
// int와 Integer의 차이라서..
fun ex45_03() {
    val j1: Int? = 12345
    val j2: Int? = 12345
    println(j1 == j2)
    println(j1 === j2)
}
