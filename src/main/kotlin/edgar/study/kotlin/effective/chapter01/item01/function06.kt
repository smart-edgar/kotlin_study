package edgar.study.kotlin.effective.chapter01.item01

var name = "Marcin"
var surname = "Moskala"
val fullName
    get() = "$name $surname"

fun  main() {
    println(fullName)
    name = "Maja"
    println(fullName)
}
