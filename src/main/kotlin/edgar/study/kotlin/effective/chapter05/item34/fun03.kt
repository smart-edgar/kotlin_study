package edgar.study.kotlin.effectivhe.chapter05.item34

class Pizza_34 private constructor(
    val size: String,
    val cheese: Int,
    val olives: Int,
    val bacon: Int,
) {
    class Builder(private val size: String) {
        private var cheese: Int = 0
        private var olives: Int = 0
        private var bacon: Int = 0

        fun setCheese(value: Int): Builder = apply {
            cheese = value
        }

        fun setOlives(value: Int): Builder = apply {
            olives = value
        }

        fun setBacon(value: Int): Builder = apply {
            bacon = value
        }

        fun build() = Pizza_34(size, cheese, olives, bacon)
    }
}

val myFavorite = Pizza_34.Builder("L").setOlives(3).build()
val villagePizza = Pizza_34.Builder("L")
    .setCheese(1)
    .setOlives(2)
    .setBacon(3)
    .build()
