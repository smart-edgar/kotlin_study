package edgar.study.kotlin.starter.lec02

fun main() {

}

fun startWith1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null string")
    }

    return str.startsWith("A")

    //위 코드를 safeCall과 elvis 연산자를 이용하여 변경
//    return str?.startsWith("A")
//        ?: throw IllegalArgumentException("null string")
}

fun startWith2(str: String?): Boolean? {
    if (str == null) {
        return null
    }

    return str.startsWith("A")

    //위 코드를 safeCall을 이용하여 변경(safe call에서 null이면 null로 리턴)
//    return str?.startsWith("A")
}

fun startWith3(str: String?): Boolean {
    if (str == null) {
        return false
    }

    return str.startsWith("A")

    //위 코드를 safeCall과 elvis 연산자를 이용하여 변경
//    return str?.startsWith("A") ?: false
}

//fun startWith4(str: String?): Boolean {
//    return str.startsWith("A") // 에러 : str은 null이 올수 있기에 자동으로 에러표시(null 체크 후에는 정상)
//}

fun startWith5(str: String?): Boolean {
    return str!!.startsWith("A") //str이 null 들어올수가 없다고 강제 선언
}

fun safeCallAndElvis() {
    val str1: String = "ABC"
    println(str1.length) // ABC

    var str2: String? = "ABC"
//    println(str2.length) //에러 str2가 null이 될수 있어서..
    println(str2?.length) //정상 str2?로 선언하면서 null이 아닐경우 length 체크 하도록.. //str2가 null이면 null로 표시

    var str3: String? = null
    println(str3?.length ?: 0) // elvis 연산자 str3이 null이면 "?:" 다음 값을 리턴
}

fun crossPlatform() {
    //java코드를 이용할때.. Nullable / NotNull 등의 어노테이션이 필수
    //미사용시 타입의 널 허용인지 확인이 안되기에 에러 발생(런타임시 에러 발생)
}