package edgar.study.kotlin.effective.chapter06.item44

//확장함수
fun String.isPhoneNumber(): Boolean = length == 7 && all { it.isDigit() }

//인터페이스 내부에 정의
interface PhoneBook {
    fun String.isPhoneNumber(): Boolean
}

class Fizz: PhoneBook {
    override fun String.isPhoneNumber(): Boolean = length == 7 && all { it.isDigit() }
}
