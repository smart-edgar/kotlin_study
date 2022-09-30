package edgar.study.kotlin.starter.lec01

fun main() {
    var number1 = 10L //가변
    var num1_init: Long
    // println(num1_init) //가변 초기화 안하고 사용시 에러
    val number2 = 10L //불변
    val num2_init: Long
    // println(num2_init)  //불변 초기화 안하고 사용시 에러

    var number3: Long? = 1_000 //자동으로 Long / long 을 변환해 준다
    number3 = null //Long의 특징인 null을 사용하려면 선언할때 Long에 "?"를 붙여줘야 한다.

    var person = Person("edgar");

    println(number1)
    println(number2)
    println(number3)
    println(person.name)
}

class Person (name: String) {
    val name = name
}