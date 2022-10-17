package edgar.study.kotlin.starter.lec14


//data class로 선언하면
//equals, hashCode, toString이 자동 생성..
data class PersonDTO(
    val name: String,
    val age: Int) {
}