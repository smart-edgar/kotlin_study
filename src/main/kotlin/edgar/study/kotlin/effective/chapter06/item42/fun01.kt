package edgar.study.kotlin.effective.chapter06.item42

class User42_1(
    val name: String,
    val surname: String,
): Comparable<User42_1> {
    override fun compareTo(other: User42_1): Int = compareValues(surname, other.surname)
}

class User42_2(
    val name: String,
    val surname: String,
): Comparable<User42_2> {
    override fun compareTo(other: User42_2): Int = compareValuesBy(this, other, { it.surname }, { it.name })
}
