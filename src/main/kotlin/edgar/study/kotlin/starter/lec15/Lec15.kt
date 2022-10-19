package edgar.study.kotlin.starter.lec15

fun main() {
    kotlinArray()
}

fun kotlinArray() {
    val arr = arrayOf(100, 200)
    arr.plus(300)
    val arr2 = mutableListOf(100, 200)
    val arr3 = mutableSetOf(100, 200)

    for (i in arr.indices) {
        println("${i} - ${arr[i]}")
    }

    println()

    for ((i, v) in arr.withIndex()) {
        println("${i} - ${v}")
    }
}

fun kotlinList() {
    val list = listOf(100, 200)
    val empty = emptyList<Int>()

    //List에 null이 들어갈수 있지만 List가 null은 아님
    //List<Int?>

    //List에 null이 들어갈수 없지만 List가 null일수 있음
    //List<Int>?

    //List에 null이 들어갈수 있고 List가 null일수 있음
    //List<Int?>?
}

fun kotlicMap() {
    val oldMap = mutableMapOf<Int, String>()
    oldMap.put(100, "새로운 키")
    oldMap[2] = "ABC"
}