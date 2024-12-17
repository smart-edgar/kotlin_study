package edgar.study.kotlin.effective.chapter06.item36

class Progress {
    fun showProgress() { /* show progress */ }
    fun hideProgress() { /* hide progress */ }
}

class ProfileLoaderWithProgressClass {
    val progress: Progress = Progress()

    fun load() {
        progress.showProgress()
        //프로파일을 읽어 들임
        progress.hideProgress()
    }
}

class ImageLoaderWithProgressClass {
    val progress: Progress = Progress()

    fun load() {
        progress.showProgress()
        //이미지를 읽어 들임
        progress.hideProgress()
    }
}

//class ImageLoaderAlert {
//    private val progress = Progress()
//    private val finishedAlert = FinishedAlert()
//
//    fun load() {
//        progress.showProgress()
//
//        progress.hideProgress()
//        finishedAlert.show()
//    }
//}
