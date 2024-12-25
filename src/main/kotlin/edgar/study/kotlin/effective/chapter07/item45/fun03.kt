package edgar.study.kotlin.effective.chapter07.item45

import java.util.LinkedList

class Node<T>(
    val head: T,
    val tail: LinkedList<T>,
): LinkedList<T>()

class Empty<T>: LinkedList<T>()

val list1: LinkedList<Int> = Node(1, Node(2, Node(3, Empty())))
val list2: LinkedList<String> = Node("A", Node("B", Empty()))
