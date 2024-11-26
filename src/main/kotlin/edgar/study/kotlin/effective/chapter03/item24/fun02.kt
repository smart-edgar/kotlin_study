package edgar.study.kotlin.effective.chapter03.item24

fun printProcessedNumber(transition: (Int)->Any) {
    println(transition(42))
}


fun ex24_4() {
    val intToDouble: (Int) -> Number = { it.toDouble() }
    val numberAsText: (Number) -> Any = { it.toString() }
    val identity: (Number) -> Number = { it }
    val numberToInt: (Number) -> Int = { it.toInt() }
    val numberHash: (Any) -> Number = { it.hashCode() }

    printProcessedNumber(intToDouble)
    printProcessedNumber(numberAsText)
    printProcessedNumber(identity)
    printProcessedNumber(numberToInt)
    printProcessedNumber(numberHash)
}
