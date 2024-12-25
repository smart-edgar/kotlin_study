package edgar.study.kotlin.effective.chapter07.item45

fun <T: Comparable<T>> Iterable<T>.countMax(): Int = count { it == this.max() }

fun <T: Comparable<T>> Iterable<T>.countMax2(): Int {
    var max = this.max()
    return count { it == max }
}
