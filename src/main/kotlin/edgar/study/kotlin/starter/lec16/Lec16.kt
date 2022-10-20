package edgar.study.kotlin.starter.lec16


fun main() {
    val str = "ABCDEFG"
    println(str.lastChar())
    println()
    println(1.add(1))
    println(1.add2(2))
    println(1 add2 3)
    println()
    println(1.add3(4))
    println()
    innerFun()
}


//확장 함수
// 확장함수와 멤버함수의 이름이 동일하면 멤버함수가 우선적으로 호출된다)
// 확장함수는 현재 타입 기준으로 호출
// java에서 호출 하는 방법은 java class에 있음
fun String.lastChar(): Char { //String : 확장하려는 클래스
    return this[this.length - 1] //this : 수신객체
}

//확장함수를 Getter로 사용 가능
val String.lastChar: Char
    get() = this[this.length - 1]

//infix 함수
// infix를 붙이면서 "3 add2 3" 같이 호출 가능(중위함수)
fun Int.add(o: Int): Int {
    return this + o
}

infix fun Int.add2(o: Int): Int {
    return this + o
}


//inline 함수
// 함수 호출시 컴파일을 할 경우 코드가 복사 됨
// inline 함수 사용시 성능 측정과 함께 신중하게 사용하여야 함
inline fun Int.add3(o: Int): Int {
    return this + o
}

//지역 함수
// 함수 내 함수가 존재
// depth가 깊어지기도 하고 코드가 깔끔하지 못함
fun innerFun() {
    fun real() {
        println("inner")
    }

    real()
}