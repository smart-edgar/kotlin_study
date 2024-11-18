package edgar.study.kotlin.effective.chapter02.item16

val s = (1..100).sum()

//이렇게 하지마세요
class UserIncorrect {
    private var name: String = ""
    fun getName() = name
    fun setName(name: String) {
        this.name = name
    }
}

class UserCorrect {
    var name: String = ""
}
