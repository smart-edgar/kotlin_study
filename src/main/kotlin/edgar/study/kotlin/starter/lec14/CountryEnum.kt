package edgar.study.kotlin.starter.lec14

enum class CountryEnum(
    val code: String) {

    KOREA("KR"),
    USA("US")

}

fun handleCountry(country: CountryEnum) {
    when(country) {
        CountryEnum.KOREA -> println("한국입니다.")
        CountryEnum.USA -> println("미국입니다.")
        //else는 생량가능
        else -> println("미등록 국가입니다.")
    }
}