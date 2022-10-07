package edgar.study.kotlin.starter.lec08

fun main() {
//    println(max(11, 12))
//    println(max(14, 13))
//    println()
//    println(max1(21, 22))
//    println(max1(24, 23))
//    println()
//    println(max2(31, 32))
//    println(max2(34, 33))
//    println()
//    println(max3(41, 42))
//    println(max3(44, 43))

//    repeat("Edgar", 5, true)
//    println()
//    repeat("Edgar", 4, false)
//    println()
//    repeat("Edgar")
//    println()
//    repeat(str = "Edgar", newLine = false, num = 5)
//    println()

    printAll("E", "d", "g", "a", "r")
    printAll(*arrayOf("E", "d", "g", "a", "r")) //arrayOf를 쓰려면 *를 붙여줘야 한다(스프레드 연산자)
}

fun max(a: Int, b: Int): Int {
    if (a > b) {
        return a
    }
    return b
}

fun max1(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

private fun max2(a: Int, b: Int): Int =
    if (a > b) {
        a
    } else {
        b
    }

fun max3(a: Int, b: Int) = if (a > b) a else b

fun repeat(str: String, num: Int = 3, newLine: Boolean = true) {
    for (n in 1..num) {
        if (newLine) {
            println(str)
        } else {
            print(str)
        }
    }
    println()
}

fun printAll(vararg str: String) {
    for (s in str) {
        println(s)
    }
}