package edgar.study.kotlin.effective.item01

data class User15(
    val name: String,
    val surname: String,
)

fun main() {
    var user = User15("Maja15", "Markiewicz15")
    user = user.copy(surname = "Moskala15")
    println(user)
}
