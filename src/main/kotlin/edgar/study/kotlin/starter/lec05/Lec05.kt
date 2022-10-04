package edgar.study.kotlin.starter.lec05

fun main() {

}

fun validateScore(score: Int) {
    if (score > 0) {
        throw IllegalArgumentException("파라미터 값(${score})은 0보다 작을 수 없습니다.")
    }
}

fun getPassOrFail(score: Int): String {
    //Statement : 하나의 문장 or 값 으로 도출되지 않는다.

//    if (score >= 50) {
//        return "P"
//    } else {
//        return "F"
//    }
    //Expression로 변환하려면 아래와 같다.
    // score >= 50 ? "P" : "F"

    //Expression : 하나의 값으로 도출된다.
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
    //Kotlin에서는 if문이 Expression이다.
    var grade = return if (score >= 50) {
        "P"
    } else {
        "F"
    }
    //Kotlin에서는 삼항연산자가 없음
}

fun getGrade(score: Int): String {
    if (score !in 0..100) {
        throw IllegalArgumentException("파라미터 값(${score})의 범위는 0부터 100입니다.")
    }

    val grade = return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else if (score >= 60) {
        "D"
    } else {
        "F"
    }
}

fun getGradeSwitch(score: Int): String {
    //Kotlin은 switch문이 없음
    // 조건은 is도 가능
    //추후 Enum과 Sealed와 같이 사용하면 활용도가 더 높아짐
//    when (값) {
//        조건 -> 결과
//        조건 -> 결과
//        else -> 디폴트 결과
//    }

//    return when (score / 10) {
//        10 -> "A"
//        9 -> "A"
//        8 -> "B"
//        7 -> "C"
//        6 -> "D"
//        else -> "F"
//    }

    return when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "F"
    }
}

fun startWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(num: Int) {
    when (num) {
        //in -1..1 -> println("많이 본 숫자입니다.")
        1, 0, -1 -> println("많이 본 숫자입니다.")
        else -> println("1, 0, -1이 아닙니다.")
    }
}

fun judgeNumber2(num: Int) {
    //when에 값이 없는 경우
    when {
        num == 0 -> println("0 입니다.")
        num % 2 == 0 -> println("짝수 입니다.")
        else -> println("홀수 입니다.")
    }
}