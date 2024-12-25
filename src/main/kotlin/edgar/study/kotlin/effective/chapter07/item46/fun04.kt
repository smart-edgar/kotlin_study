package edgar.study.kotlin.effective.chapter07.item46

class OnClickListener: () -> Unit {
    override fun invoke() {
        //..
    }
}

inline fun repeat2(times: Int, action: (Int) -> Unit) {
    for (i in 0 until times) {
        action(i)
    }
}

fun repeatNoinline(times: Int, action: (Int) -> Unit) {
    for (i in 0 until times) {
        action(i)
    }
}
