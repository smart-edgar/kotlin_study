package edgar.study.kotlin.effective.chapter07.item46

inline fun repeat(times: Int, action: (Int) -> Unit) {
    for (index in 0 until times) {
        action(index)
    }
}


fun ex46_01() {
    repeat(10) {
        println(it)
    }

    //위 코드가 컴파일 시점에 아래 코드로 대체 됨
    for (index in 0 until 10) {
        println(index)
    }
}
