package edgar.study.kotlin.effective.chapter03.item23

class Forest3<T: Tree> {
    fun addTree(tree: T) {
        //...
    }
}

fun ex23_3() {
    val forest = Forest3<Birch>()
    forest.addTree(Birch())
//    forest.addTree(Spruce()) //error
}
