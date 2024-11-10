package edgar.study.kotlin.effective.item01

import java.util.SortedSet
import java.util.TreeSet

data class FullName(
    var name: String,
    var surname: String,
)

fun main() {
    val names: SortedSet<FullName> = TreeSet()
    val person = FullName("AAA", "AAA")
    names.add(person)
    names.add(FullName("Jordan", "Hansen"))
    names.add(FullName("David", "Blanc"))

    println(names)
    println(person in names)

    person.name = "ZZZ"
    println(names)
    println(person in names)
}
