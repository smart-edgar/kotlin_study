package edgar.study.kotlin.starter.lec13

class House(
    val address: String,
    val livingRoom: LivingRoom) {

    //권장되는 내부 클래스 생성
    //디폴트
//    class LivingRoom(
//        val area: Double)

    //권장하지 않는 내부 클래스 생성
    //명시적으로 inner를 선언해줘야함..
    //밖의 클래스 참조시 this@밖깥클래스 로 호출
    inner class LivingRoom(
        val area: Double) {
        val address: String
        get() = this@House.address
    }

    //java => kotlin
    //static 명시 => 명시 없음(디폴트)
    //명시 없음 => inner 명시
}