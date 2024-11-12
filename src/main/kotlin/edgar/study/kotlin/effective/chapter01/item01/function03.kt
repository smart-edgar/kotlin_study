package edgar.study.kotlin.effective.chapter01.item01

suspend fun main() {
    var num = 0
//    coroutineScope {
//        for (i in 1..1000) {
//            launch {
//                delay(10)
//                num += 1
//            }
//        }
//    }
    print(num)
}
