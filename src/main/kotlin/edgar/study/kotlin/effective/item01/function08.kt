package edgar.study.kotlin.effective.item01

interface Element {
    val active: Boolean
}

class ActualElement: Element {
    override var active: Boolean = false
}
