package edgar.study.kotlin.effective.chapter03.item24

class Cup<T>

fun ex24_1() {
//    val anys: Cup<Any> = Cup<Int>() // 오류
//    val nothings: Cup<Nothing> = Cup<Int>() // 오류
}

class Cup2<out T>
open class Dog2
class Puppy2: Dog2()

fun ex24_2() {
//    val b: Cup2<Dog2> = Cup2<Puppy2>()
//    val a: Cup2<Puppy2> = Cup2<Dog2>() // 오류
//    val anys: Cup2<Any> = Cup2<Int>()
//    val nothings: Cup2<Nothing> = Cup2<Int>() // 오류
}

class Cup3<in T>
open class Dog3
class Puppy3(): Dog3()
fun ex24_3() {
//    val b: Cup3<Dog3> = Cup3<Puppy3>() // 오류
//    val a: Cup3<Puppy3> = Cup3<Dog3>()
//
//    val anys: Cup3<Any> = Cup3<Int>() // 오류
//    val nothings: Cup3<Nothing> = Cup3<Int>()
}
