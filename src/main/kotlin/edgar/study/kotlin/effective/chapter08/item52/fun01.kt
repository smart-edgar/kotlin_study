package edgar.study.kotlin.effective.chapter08.item52

operator fun <T> Iterable<T>.plus(element: T): List<T> {
    if (this is Collection) return this.plus(element)
    val res = ArrayList<T>()
    res.addAll(this)
    res.add(element)
    return res
}
