package edgar.study.kotlin.effective.chapter06.item39

sealed class ValueMatcher2<T> {
    abstract fun match(value: T): Boolean

    class Equal<T>(val value: T) : ValueMatcher2<T>() {
        override fun match(value: T): Boolean = value == this.value
    }

    class NotEqual<T>(val value: T) : ValueMatcher2<T>() {
        override fun match(value: T): Boolean = value != this.value
    }

    class EmptyList<T>() : ValueMatcher2<T>() {
        override fun match(value: T): Boolean = value is List<*> && value.isEmpty()
    }

    class NotEmptyList<T>() : ValueMatcher2<T>() {
        override fun match(value: T): Boolean = value is List<*> && value.isNotEmpty()
    }
}
