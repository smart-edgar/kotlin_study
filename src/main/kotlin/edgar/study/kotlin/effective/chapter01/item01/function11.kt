package edgar.study.kotlin.effective.chapter01.item01

fun main() {
    val list = listOf(1, 2, 3)

    if (list is MutableList) {
        list.add(4)
    }
}

/*
Exception in thread "main" java.lang.UnsupportedOperationException
at java.base/java.util.AbstractList.add(AbstractList.java:153)
at java.base/java.util.AbstractList.add(AbstractList.java:111)
at edgar.study.kotlin.effective.item01.Function11Kt.main(function11.kt:7)
at edgar.study.kotlin.effective.item01.Function11Kt.main(function11.kt)
 */
