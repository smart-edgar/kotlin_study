package edgar.study.kotlin.effective.chapter05.item33

class MyLinkedList2<T>(
    val head: T,
    val tail: MyLinkedList2<T>?
) {
    companion object {
        fun <T> of(vararg elements: T): MyLinkedList2<T>? {
            if (elements.isEmpty()) return null
            val head = elements.first()
            val elementsTail = elements.copyOfRange(1, elements.size)
            val tail = of(*elementsTail)
            return MyLinkedList2(head, tail)
        }
    }
}

val list3 = MyLinkedList2.of(1, 2)
