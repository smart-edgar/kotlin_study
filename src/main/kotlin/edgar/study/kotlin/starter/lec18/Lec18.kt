package edgar.study.kotlin.starter.lec18

fun main() {
    filters()
    println()
    collectionFunction()
}

fun getFruitList(): List<Fruit> {
    return listOf(
        Fruit(1, "사과", 1_000, 1_500),
        Fruit(2, "사과", 1_200, 1_700),
        Fruit(3, "사과", 1_200, 1_700),
        Fruit(4, "사과", 1_500, 2_000),
        Fruit(5, "바나나", 3_000, 3_500),
        Fruit(6, "바나나", 3_200, 3_700),
        Fruit(7,"바나나", 2_500, 3_000),
        Fruit(8,"수박", 10_000, 10_500)
    )
}

fun filters() {
    val apples = getFruitList().filter { fruit -> fruit.name == "사과" }
    println(apples)

    val bananas = getFruitList().filterIndexed { idx, fruit ->
        println(idx)
        fruit.name == "바나나"
    }
    println(bananas)

    val applePrices = getFruitList().filter { fruit -> fruit.name == "사과" }
        .map { fruit -> fruit.currentPrice }
    println(applePrices)

    val bananaPrices = getFruitList().filter { fruit -> fruit.name == "사과" }
        .mapIndexed { idx, fruit ->
            println(idx)
            fruit.currentPrice
        }
    println(bananaPrices)

//    val waterMelons = getFruitList().filter { fruit -> fruit.name == "수박" }
//        .mapNotNull { fruit -> fruit.nullOrValue() }
//    println(waterMelons)
}

fun collectionFunction() {
    //조건을 모두 만족하면 true
    val isAllApple = getFruitList().all { fruit -> fruit.name == "사과" }
    println(isAllApple)

    //조건을 모두 불만족하면 true
    val isNoApple = getFruitList().none { fruit -> fruit.name == "바나나" }
    println(isNoApple)

    //조건을 하나라도 만족하면 true
    val isNoApple2 = getFruitList().any { fruit -> fruit.name == "바나나" }
    println(isNoApple2)

    val count = getFruitList().count()
    println(count)

    val sortedApple = getFruitList().sortedBy { fruit -> fruit.currentPrice }
    println(sortedApple)

    val sortedDescBanana = getFruitList().sortedByDescending { fruit -> fruit.currentPrice }
    println(sortedDescBanana)

    val distinctFruit = getFruitList().distinctBy { fruit -> fruit.name }
        .map { fruit -> fruit.name }
    println(distinctFruit)

    println(getFruitList().first())
    println(getFruitList().firstOrNull())

    println(getFruitList().last())
    println(getFruitList().lastOrNull())
}

fun listToMap() {

}