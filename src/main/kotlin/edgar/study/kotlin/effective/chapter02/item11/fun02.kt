package edgar.study.kotlin.effective.chapter02.item11

class Person(val name: String)
var person: Person? = null

fun printName() {
    person?.let {
        println(it.name)
    }
}

