package edgar.study.kotlin.starter.lec17


fun fruitFilter(fruits: List<Fruit>,
                filter: (Fruit) -> Boolean): List<Fruit> {

    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }

    return results
}