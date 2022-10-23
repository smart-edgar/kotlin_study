package edgar.study.kotlin.starter.lec17

fun main() {
    val list = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000)
    )

    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }

    println(isApple(list[0]))
    println(isApple.invoke(list[1]))

    println(isApple2(list[2]))
    println(isApple2.invoke(list[3]))

    println()
    println(fruitFilter(list, isApple).toString())
    println()
    println(fruitFilter(list) { fruit ->  fruit.name == "바나나"})
    println()
    println(fruitFilter(list) { it.name == "바나나"})
    println()
    println(fruitFilter(list) {
        println(it.name)
        it.name == "수박"
    })

}