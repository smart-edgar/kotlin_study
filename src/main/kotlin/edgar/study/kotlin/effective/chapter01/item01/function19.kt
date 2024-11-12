package edgar.study.kotlin.effective.chapter01.item01

data class User19(val name: String)

class UserRepository {
    private val storedUsers: MutableMap<Int, String> = mutableMapOf()

    fun loadAll(): MutableMap<Int, String> {
        return storedUsers
    }
}
