package edgar.study.kotlin.effective.chapter07.item48

import java.util.EmptyStackException

class Stack {
    private var elements: Array<Any?> = arrayOfNulls(DEFAULT_INITAL_CAPACITY)
    private var size = 0


    fun push(e: Any?) {
        ensureCapacity()
        elements[size++] = e
    }

    fun pop(): Any? {
        if (size == 0) {
            throw EmptyStackException()
        }
        //메모리 누수 해결
        //return elements[--size]
        val elem = elements[--size]
        elements[size] = null
        return elem
    }

    private fun ensureCapacity() {
        if (elements.size == size) {
            elements = elements.copyOf(2 * size + 1)
        }
    }

    companion object {
        private const val DEFAULT_INITAL_CAPACITY = 16
    }
}
