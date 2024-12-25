package edgar.study.kotlin.effective.chapter07.item46

inline fun requestNewToke(
    hasToke: Boolean,
    crossinline  onRefresh: () -> Unit,
    noinline  onGenerate: () -> Unit,
) {
    if (hasToke) {
        httpCall("get-token", onGenerate)
        // 인라인이 아닌 함수를 아규먼트로 함수에 전달하려면 noinline을 사용합니다.
    } else {
        httpCall("refresh-token") {
            onRefresh()
            // Non-local 리턴이 허용되지 않는 컨텍스트에서 inline 함수를 사용하고 싶다면 crossinline을 사용합니다.
            onGenerate()
        }
    }
}

fun httpCall(url: String, callback: () -> Unit) {

}
