package edgar.study.kotlin.starter.lec12

fun main() {
    val p1 = Person.newBaby("사람1")
    println(p1)

    val p2 = Person.PersonFactory.newBaby("사람2")
    println(p2)

    Person.log()

}