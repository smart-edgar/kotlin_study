package edgar.study.kotlin.effective.chapter07.item45

fun Iterable<Int>.maxOrNull(): Int? {
    var max: Int? = null
    for (i in this) {
        max = if (i > (max ?: Int.MIN_VALUE)) i else max
    }
    return max
}

fun Iterable<Int>.maxOrNull2(): Int? {
    val iterator = iterator()
    if (!iterator.hasNext()) return null
    var max: Int = iterator.next()
    while (iterator.hasNext()) {
        val e = iterator.next()
        if (max < e) max = e
    }
    return max
}

public fun <T : Comparable<T>> Iterable<T>.max(): T? {
    val iterator = iterator()
    if (!iterator.hasNext()) return null
    var max = iterator.next()
    while (iterator.hasNext()) {
        val e = iterator.next()
        if (max < e) max = e
    }
    return max
}
