package edgar.study.kotlin.starter.lec09

//기본형(Getter와 Setter는 자동생성)
//"."을 통하여 Getter와 Setter를 사용.
// val name = person.name, person.age = 10
//class Person constructor(
//    name: String,
//    age: Int) {
//
//    val name: String = name
//    var age: Int = age
//}

//constructor 생략 가능
//class Person (
//    name: String,
//    age: Int) {
//
//    val name: String = name
//    var age: Int = age
//}

//필드 생략 가능(생성자에 val, var 정의)
//class Person (
//    val name: String,
//    var age: Int) {
//}

//Body에 내용이 없기에 { } 도 생략 가능
//class Person (
//    val name: String,
//    var age: Int)

//init 블록은 생성될때 한번만 호출되는 블록
//class Person (
//    val name: String,
//    var age: Int) {
//    init {
//        if (age <= 0) {
//            throw IllegalArgumentException("${name}의 나이는 ${age}가 될수 없습니다.")
//        }
//    }
//}

// 부생성자({} 를 이용한 Body 사용 가능)
//class Person (
//    val name: String,
//    var age: Int) {
//    init {
//        if (age <= 0) {
//            throw IllegalArgumentException("${name}의 나이는 ${age}가 될수 없습니다.")
//        }
//        println("초기화")
//    }
//
//    constructor(name: String): this(name, 1) {
//        println("첫번째 부생성자")
//    }
//    constructor(): this("홍길동") {
//        println("두번째 부생성자")
//    }
//}

//부생성자도 생략 가능?
class Person (
    val name: String = "홍길동",
    var age: Int = 1) {
    init {
        if (age <= 0) {
            throw IllegalArgumentException("${name}의 나이는 ${age}가 될수 없습니다.")
        }
        println("초기화")
    }

//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

//    val isAdult: Boolean
//        get() {
//            return this.age >= 20
//        }

    val isAdult: Boolean
        get() = this.age >= 20


}