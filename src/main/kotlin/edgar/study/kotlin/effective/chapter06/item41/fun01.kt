package edgar.study.kotlin.effective.chapter06.item41

data class FullName(
    val name: String,
    var surname: String,
)


fun main() {
    ex41_01()
}

fun ex41_01() {
    val person = FullName("Maja", "Markiewicz")
    val s = mutableSetOf<FullName>()
    s.add(person)
    person.surname = "Moskala"
    println(person)
    println(person in s)
    println(s.first() == person)
}


