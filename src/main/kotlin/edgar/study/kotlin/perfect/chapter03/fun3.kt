package edgar.study.kotlin.perfect.chapter03


//오버로딩
fun readInt() = readLine()!!.toInt()
fun readInt(radix: Int) = readLine()!!.toInt(radix)

fun mul(a: Int, b: Int) = a * b //1번
fun mul(a: Int, b: Int, c: Int) = a * b* c //2번
fun mul(s: String, n: Int) = s.repeat(n) //3번
fun mul(o: Any, n: Int) = Array(n) { o } //4번

fun main() {
    println(mul(1, 2)) //1번 호출
//    println(mul(1, 2L)) //에러 : b가 Long형 타입인데 처리할수 있는 함수가 없음
    println(mul(1L, 2)) //4번 호출
    println(mul("0", 3)) //3번 호출
    println(mul("0" as Any, 3)) //4번 호출

    println(mul()) //디폴트 적용된 함수 호출
    println()
    println(restrictToRange(10, what = 11))
    println(restrictToRange2(10))
    println(restrictToRange2(10, 20))
    println(restrictToRange2(10, 20, 30))
}
//디폴트 값
fun mul(a: Int = 5, b: Int = 10, c: Int = 15, d: Int = 20) = a * b * c * d


fun restrictToRange(
    from: Int = Int.MIN_VALUE,
    to: Int = Int.MAX_VALUE,
    what: Int): Int = Math.max(from, Math.min(to, what))

//디폴트 값이 있는 파라미터는 뒤로 놓아야 좋다.
fun restrictToRange2(
    what: Int,
    from: Int = Int.MIN_VALUE,
    to: Int = Int.MAX_VALUE): Int = Math.max(from, Math.min(to, what))


