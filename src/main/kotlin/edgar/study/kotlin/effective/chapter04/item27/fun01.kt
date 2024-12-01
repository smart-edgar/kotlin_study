package edgar.study.kotlin.effective.chapter04.item27

class ch04_item27_01{
    fun isPasswordValid(text: String): Boolean {
        if (text.length < 7) return false
        //..

        return true
    }


    fun isPasswordValid2(text: String): Boolean {
        if (text.length < MIN_PASSWORD_LENGTH) return false
        //..

        return true
    }

    companion object {
        const val MIN_PASSWORD_LENGTH = 7
    }
}
