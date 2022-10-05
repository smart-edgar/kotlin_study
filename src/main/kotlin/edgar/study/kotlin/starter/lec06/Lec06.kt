package edgar.study.kotlin.starter.lec06

fun main() {
    foreach()
    println()
    forLoop()
    println()
    whileLoop()
}

fun foreach() {
    val nums: List<Int> = listOf(1, 2, 3, 4, 5)

    for (n:Int in nums) {
        println(n)
    }
}

fun forLoop() {
    val min: Int = 1
    val max: Int = 5
    for (n in min..max) {
        println(n)
    }
    println()
    //downTo 내려가는 방법
    for (n in max downTo min) {
        println(n)
    }
    println()
    //step 은 증가(2씩 증가)
    for (n in min..max step 2) {
        println(n)
    }
    println()
    for (n in max downTo min step 3) {
        println(n)
    }
}

fun whileLoop() {
    var count = 1
    while (count < 6) {
        println(count)
        count++
    }
}