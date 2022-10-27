package edgar.study.kotlin.starter.lec19

import edgar.study.kotlin.starter.lec18.Fruit

fun main() {
    val person = Person("한국", 18)
    println(person)

    println()
    testA()
}

fun filterFruit(fruits: List<Fruit>, filter: (Fruit) -> Boolean) {

}

//typealias 를 통하여 축약
typealias FruitFilter = (Fruit) -> Boolean
fun filterFruit2(fruits: List<Fruit>, filter: FruitFilter) {

}

//클래스 컬렉션을 축약할때도 사용
typealias USGTMap = Map<String, UltraSuperGuardianTribe>
fun usgt(usgtMap: USGTMap) {

}

fun testA() {
    val list = listOf(1, 2, 3)

    list.map{ obj -> obj + 1 }
        .forEach { obj -> println(obj) }

    for (i in list) {
        if (i == 2) {
            break
        }
    }

    //label run
    run {
        list.forEach { i ->
            if (i == 2) {
                //jump
                return@run
            }

        }
    }
}

fun getNumberOrNull(): Int? {
    return if (number <= 0) {
        null
    } else {
        number
    }
}

fun getNumberOrNull2(): Int? {
    //takeIf : 주어진 조건에 해당하면 값/ 해당하지 않으면 null 리턴
    //조건 : true -> 응답값
    //조건 : false -> null
    return number.takeIf{ it > 0 }
}

fun getNumberOrNull3(): Int? {
    //takeUnless : 주어진 조건을 만족하지 못하면 값/ 해당하지 않으면 null 리턴
    //조건 : false -> 응답값
    //조건 : true -> null
    return number.takeUnless{ it <= 0 }
}

