package edgar.study.kotlin.effective.chapter02.item12

//operator fun Int.times(operation: () -> Unit): () -> Unit = {
//    repeat(this) { operation() }
//}
//
//val tripleHello = 3 * { println("Hello") }
//
//fun ex21() { tripleHello() }

//operator fun Int.times(operation: () -> Unit) = {
//    repeat(this) { operation() }
//}
//
//val tripleHello = 3 * { print("Hello") }

//infix fun Int.timesRepeated(operation: () -> Unit) = {
//    repeat(this) { operation() }
//}
//val tripledHello = 3 timesRepeated { println("Hello") }
//fun ex22() { tripledHello() }

//fun ex23() {
//    repeat(3) { println("Hello") }
//}
