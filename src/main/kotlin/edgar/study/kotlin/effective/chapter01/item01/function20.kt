package edgar.study.kotlin.effective.chapter01.item01

data class User20(val name: String)

class UserHolder {
    private val user: User20 = TODO()

    fun get(): User20 {
        return user.copy()
    }
}
