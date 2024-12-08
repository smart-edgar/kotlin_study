package edgar.study.kotlin.effective.chapter05.item33

class MyLinkedList<T>(
    val head: T,
    val tail: MyLinkedList<T>?,
)

val list = MyLinkedList(1, MyLinkedList(2, null))

fun <T> myLinkedListOf(
    vararg elements: T,
): MyLinkedList<T>? {
    if (elements.isEmpty()) return null
    val head = elements.first()
    val elementsTail = elements.copyOfRange(1, elements.size)
    val tail = myLinkedListOf(*elementsTail)
    return MyLinkedList(head, tail)
}

val list2 = myLinkedListOf(1, 2)
