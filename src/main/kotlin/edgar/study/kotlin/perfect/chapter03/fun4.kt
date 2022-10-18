package edgar.study.kotlin.perfect.chapter03

fun main() {
    printSorted(1, 5, 3, 2, 4)

    val arr = intArrayOf(2, 5, 8, 1, 4, 7)
    printSorted(*arr)
    println(arr.contentToString())
}
fun printSorted(vararg items: Int) {
    items.sort()
    println(items.contentToString())

    overload(1, 2) // 첫번째 오버로딩 호출(정확한 함수가 있으면 우선 호출)
    overload(1, 2, 3) // 두번째 오버로드 호출(정확한 함수가 없기에 가변 파라미터 함수 호출)
}

fun overload(a: Int, b: Int) = {}
fun overload(vararg items: Int) = {}