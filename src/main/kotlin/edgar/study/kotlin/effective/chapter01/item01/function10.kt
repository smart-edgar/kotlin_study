package edgar.study.kotlin.effective.chapter01.item01

inline fun <T, R> Iterable<T>.map(
    transformation: (T) -> R
): List<R> {
    val list = ArrayList<R>()
    for (elem in this) {
        list.add(transformation(elem))
    }

    return list
}
