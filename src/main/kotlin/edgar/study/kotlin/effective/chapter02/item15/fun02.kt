package edgar.study.kotlin.effective.chapter02.item15

class Node(val name: String) {
    fun makeChild(childName: String) =
        create("$name.$childName").apply { println("Created: $name") }

    fun create(name: String): Node? = Node(name)
}

class Node2(val name: String) {
    fun makeChild(childName: String) =
        create("$name.$childName").apply { println("Created: ${this?.name}") }

    fun create(name: String): Node? = Node(name)
}

class Node3(val name: String) {
    fun makeChild(childName: String) =
        create("$name.$childName").also { println("Created: ${it?.name}") }

    fun create(name: String): Node? = Node(name)
}

class Node4(val name: String) {
    fun makeChild(childName: String) =
        create("$name.$childName").apply { println("Created: ${this?.name} in ${this@Node4.name}") }

    fun create(name: String): Node? = Node(name)
}

fun main() {
    val node = Node("parent")
    node.makeChild("child")

    val node2 = Node2("parent2")
    node2.makeChild("child2")

    val node3 = Node3("parent3")
    node3.makeChild("child3")

    val node4 = Node4("parent4")
    node4.makeChild("child4")
}
