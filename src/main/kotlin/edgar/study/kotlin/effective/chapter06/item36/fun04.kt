package edgar.study.kotlin.effective.chapter06.item36

abstract class InternetLoader(val showAlert: Boolean) {
    fun load() {
        //프로그레스 바를 보여줌
        innerLoad()
        //프로그레스 바를 숨김
        if (showAlert) {
            //경고창 출력
        }
    }

    abstract fun innerLoad()
}

class ProfileLeader2 : InternetLoader(true) {
    override fun innerLoad() {
        //프로파일 읽어 들임
    }
}

class ImageLoader2 : InternetLoader(false) {
    override fun innerLoad() {
        //이미지를 읽어들임
    }
}
