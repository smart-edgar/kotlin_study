package edgar.study.kotlin.starter.lec04

fun main() {
    compareTo()

    println("|| 연산자")
    if (funFalse() || funTrue()) {
        println("|| if")
    }

    println("&& 연산자")
    if (funFalse() && funTrue()) {
        println("&& if")
    }

    kotlinOverloading()
}

fun compareTo() {
    val money1 = JavaMoney(1_000L)
    val money2 = JavaMoney(2_000L)

    if (money1 > money2) { //java에서는 money1.compareTo(money2) > 0
        println("money1이 money2보다 크다")
    } else if (money1 == money2) { //java에서는 money1.compareTo(money2) == 0
        println("money1와 money2가 같다")
    } else if (money1 < money2) { //java에서는 money1.compareTo(money2) < 0
        println("money1이 money2보다 작다")
    }


    val money3 = JavaMoney(5_000L)
    val money4 = money3
    val money5 = JavaMoney(5_000L)
    //java
    //money3 == money4 객체 주소값이 같은지 동일하다
    //money3.equals(money5) 객체가 값이 동등하다
    //kotlin
    println(money3 === money4) //객체 주소값이 같은지 동일하다
    println(money3 == money5) //객체가 값이 동등하다(내부적으로 equals를 호출)
}

fun funFalse(): Boolean {
    println("funFalse")
    return false
}

fun funTrue(): Boolean {
    println("funTrue")
    return true
}

fun kotlinOverloading() {

    val money11 = KotlinMoney(2_000L)
    val money12 = KotlinMoney(3_000L)
    println(money11.plus(money12))
    println(money11 + money12) //plus와 같음

    println(money11 > money12)
    println(money11 == money12)
    println(money11 < money12)
}
