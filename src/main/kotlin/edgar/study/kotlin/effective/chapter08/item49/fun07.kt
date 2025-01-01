package edgar.study.kotlin.effective.chapter08.item49

fun main() {
    val products = (1..5000).toList()

    twoStepList(products)
    twoStepSequence(products)
    threeStepList(products)
    threeStepSequence(products)

}

fun twoStepList(products: List<Int>): List<Int> {
    return products
        .filter { it % 10 != 0 }
        .map { it }
}

fun twoStepSequence(products: List<Int>): List<Int> {
    return products.asSequence()
        .filter { it % 10 != 0 }
        .map { it }
        .toList()
}

fun threeStepList(products: List<Int>): Double {
    return products
        .filter { it % 10 != 0 }
        .map { it }
        .average()
}

fun threeStepSequence(products: List<Int>): Double {
    return products.asSequence()
        .filter { it % 10 != 0 }
        .map { it }
        .average()
}
