package edgar.study.kotlin.effective.chapter08.item49

//public inline fun <T> Iterable<T>.filter(
//    predicate: (T) -> Boolean
//): List<T> {
//    return filterTo(ArrayList<T>(), predicate)
//}
//
//public fun <T> Sequence<T>.filter(
//    predicate: (T) -> Boolean
//): Sequence<T> {
//    return FilteringSequence(sequence = this, sendWhen = true, predicate = predicate)
//}
