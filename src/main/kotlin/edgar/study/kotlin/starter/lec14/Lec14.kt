package edgar.study.kotlin.starter.lec14

fun main() {
    val dto1 = PersonDTO("고객1", 30)
    val dto2 = PersonDTO("고객2", 40)
    val dto3 = PersonDTO("고객1", 30)

    println(dto1 == dto2)
    println(dto1 == dto3)
    println()
    println(dto1)
    println(dto2)
    println(dto3)
    println()
    println(dto1.hashCode())
    println(dto2.hashCode())
    println(dto3.hashCode())
    println()
    println(CountryEnum.KOREA)
    println(CountryEnum.KOREA.code)
    handleCountry(CountryEnum.KOREA)
    println(CountryEnum.USA)
    println(CountryEnum.USA.code)
    handleCountry(CountryEnum.USA)
    println()
    println(CarSealed.A())
    println(CarSealed.B())
}