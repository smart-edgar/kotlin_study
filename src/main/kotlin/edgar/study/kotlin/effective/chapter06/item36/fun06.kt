package edgar.study.kotlin.effective.chapter06.item36

class CounterSet<T>: HashSet<T>() {
    var elementsAdded: Int = 0
        private set

    override fun add(element: T): Boolean {
        elementsAdded++
        return super.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        elementsAdded += elements.size
        return super.addAll(elements)
    }
}

fun main() {
    val counterList = CounterSet<String>()
    counterList.addAll(listOf("A", "B", "C"))
    println("CountSet : ${counterList.elementsAdded}")

    val counterList2 = CounterSet2<String>()
    counterList2.addAll(listOf("A", "B", "C"))
    println("CountSet2 : ${counterList2.elementsAdded}")
}

class CounterSet2<T>(
    private val innerSet: HashSet<T> = HashSet()
) : MutableSet<T> by innerSet {

    var elementsAdded: Int = 0
        private set

    override fun add(element: T): Boolean {
        elementsAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        elementsAdded += elements.size
        return innerSet.addAll(elements)
    }
}
