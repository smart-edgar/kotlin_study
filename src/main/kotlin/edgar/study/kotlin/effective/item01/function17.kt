package edgar.study.kotlin.effective.item01

import kotlin.concurrent.thread

fun main() {
    var list = listOf<Int>()

    for (i in 1..1000) {
        thread {
            list = list + i
        }
    }

    Thread.sleep(1000)
    print(list.size)
}
