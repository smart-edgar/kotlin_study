package edgar.study.kotlin.effective.chapter01.item01

class User(
    val name: String,
    val surname: String,
) {
    fun withSurname(surname: String) = edgar.study.kotlin.effective.chapter01.item01.User(name, surname)
}

fun main() {
    var user = edgar.study.kotlin.effective.chapter01.item01.User("Maja", "Markiewicz")
    user = user.withSurname("Moskala")
    println(user)
}

