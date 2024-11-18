package edgar.study.kotlin.effective.chapter02.item15

//class User: Person() {
//    private var beersDrunk: Int = 0
//
//    fun drinkBeers(num: Int) {
//        //...
//        this.beersDrunk += num
//        //...
//    }
//}

fun <T : Comparable<T>> List<T>.quickSort(): List<T> {
    if (size < 2) return this
    val pivot = first()
    val (smaller, bigger) = drop(1).partition { it < pivot }
    return smaller.quickSort() + pivot + bigger.quickSort()
}

fun <T : Comparable<T>> List<T>.quickSort2(): List<T> {
    if (this.size < 2) return this
    val pivot = this.first()
    val (smaller, bigger) = this.drop(1).partition { it < pivot }
    return smaller.quickSort2() + pivot + bigger.quickSort2()
}


