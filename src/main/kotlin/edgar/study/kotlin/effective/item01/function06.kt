package edgar.study.kotlin.effective.item01

var name = "Marcin"
var surname = "Moskala"
val fullName
    get() = "$name $surname"

fun  main() {
    println(fullName)
    name = "Maja"
    println(fullName)
}
