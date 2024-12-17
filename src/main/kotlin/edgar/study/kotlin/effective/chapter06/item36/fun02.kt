package edgar.study.kotlin.effective.chapter06.item36

abstract class LoaderWithProgress {
    fun load() {
        //프로그레스 바를 보여줌
        innerLoad()
        //프로그레스 바를 숨김
    }

    abstract fun innerLoad()
}

class ProfileLoaderWithProgress : LoaderWithProgress() {
    override fun innerLoad() {
        //프로파일을 읽어 들임
    }
}

class ImageLoaderWithProgress : LoaderWithProgress() {
    override fun innerLoad() {
        //이미지를 읽어 들임
    }
}
