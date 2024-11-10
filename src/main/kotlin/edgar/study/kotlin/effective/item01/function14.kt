package edgar.study.kotlin.effective.item01

class User(
    val name: String,
    val surname: String,
) {
    fun withSurname(surname: String) = User(name, surname)
}

fun main() {
    var user = User("Maja", "Markiewicz")
    user = user.withSurname("Moskala")
    println(user)
}

