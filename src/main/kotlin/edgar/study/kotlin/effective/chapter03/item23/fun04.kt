package edgar.study.kotlin.effective.chapter03.item23

class Forest4<T: Tree> {
    fun <ST: T> addTree(tree: ST) {
        //...
    }
}
