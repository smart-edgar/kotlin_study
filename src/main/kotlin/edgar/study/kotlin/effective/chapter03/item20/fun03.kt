package edgar.study.kotlin.effective.chapter03.item20

fun Iterable<Int>.product() =
    fold(1) { acc, i -> acc * i }
