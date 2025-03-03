package edgar.study.kotlin.effective.chapter05.item34

class Pizza{
    val size: String
    val cheese: Int
    val olives: Int
    val bacon: Int

    constructor(size: String, cheese: Int, olives: Int, bacon: Int) {
        this.size = size
        this.cheese = cheese
        this.olives = olives
        this.bacon = bacon
    }

    constructor(size: String, cheese: Int, olives: Int): this(size, cheese, olives, 0)
    constructor(size: String, cheese: Int): this(size, cheese, 0)
    constructor(size: String): this(size, 0)
}

class Pizza2(
    val size: String,
    val cheese: Int = 0,
    val olives: Int = 0,
    val bacon: Int = 0,
)
