package edgar.study.kotlin.effective.chapter06.item43

import java.util.Date

// 멤버로 메서드 정의
class Workshop() {
    fun makeEvent(date: Date): String = "Event"

    val permalink
        get() = "/workshop/name"
}


// 확장 함수로 메서드 정의
class Workshop2() {

}
fun Workshop2.makeEvent(date: Date): String = "Event"
val Workshop2.permalink
    get() = "/workshop/name"
