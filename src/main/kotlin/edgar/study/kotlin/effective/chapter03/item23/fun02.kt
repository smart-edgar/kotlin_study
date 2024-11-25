package edgar.study.kotlin.effective.chapter03.item23

interface Tree
class Birch: Tree
class Spruce: Tree

class Forest2<T: Tree> {
    fun <T: Tree> addTree(tree: T) {
        //...
    }
}

fun ex() {
    val forest = Forest2<Birch>()
    forest.addTree(Birch())
    forest.addTree(Spruce())
}

