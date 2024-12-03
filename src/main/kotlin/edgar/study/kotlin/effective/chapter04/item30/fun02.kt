package edgar.study.kotlin.effective.chapter04.item30

class MutableLazyHolder<T>(
    val initializer: () -> T
) {
    private var value: Any = Any()
    private var initialized: Boolean = false

//    override fun get(): T {
//        if (!initialized) {
//            value = initializer
//            initialized = true
//        }
//        return value as T
//    }
//
//    override fun setValue() {
//        this.value = value
//        initialized = true
//    }
}
