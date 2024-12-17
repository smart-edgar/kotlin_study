package edgar.study.kotlin.effective.chapter06.item36

abstract class Doc {
    open fun bark() { }
    open fun sniff() { }
}

class Labrador : Doc()

class RobotDoc : Doc() {
    override fun sniff() {
        throw Error("Operation not supported")
    }
}

