package edgar.study.kotlin.effective.chapter07.item46

inline fun <reified T> printTypeName() {
    println(T::class.simpleName)
}

fun ex46_02() {
    //사용
    printTypeName<Int>()
    printTypeName<Char>()
    printTypeName<String>()

    //컴파일
    println(Int::class.simpleName)
    println(Char::class.simpleName)
    println(String::class.simpleName)
}

class Worker
class Manager

val employees: List<Any> = listOf(Worker(), Manager(), Worker())
val workers: List<Worker> = employees.filterIsInstance<Worker>()
