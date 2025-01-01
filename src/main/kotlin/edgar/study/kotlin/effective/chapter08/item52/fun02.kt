package edgar.study.kotlin.effective.chapter08.item52

inline fun <T, R> Iterable<T>.map(
    trasform: (T) -> R
): List<R> {
    val size = if (this is Collection) this.size else 10
    val destination = ArrayList<R>(size)
    for (item in this) {
        destination.add(trasform(item))
    }
    return destination
}
