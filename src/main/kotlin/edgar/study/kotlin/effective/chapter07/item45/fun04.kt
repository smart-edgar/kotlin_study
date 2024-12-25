package edgar.study.kotlin.effective.chapter07.item45

sealed class LinkedList<out T>

class Node2<out T>(
    val head: T,
    val tail: LinkedList<T>,
): LinkedList<T>()

object Empty2: LinkedList<Nothing>()

val list3: LinkedList<Int> = Node2(1, Node2(2, Node2(3, Empty2)))
val list4: LinkedList<String> = Node2("A", Node2("B", Empty2))
