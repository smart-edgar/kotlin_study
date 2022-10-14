package edgar.study.kotlin.starter.lec10

class Penguin(
    species: String) : Animal(species, 2), Flyable, Swimmable {

    private val wingCount: Int = 2

    override fun move() {
        println("${this.species} 팽귄이 뒤뚱뒤뚱 걸어갑니다.")
    }

    override val legCount: Int
        get() = this.wingCount + super.legCount

    override fun act() {
        super<Swimmable>.act()
        super<Flyable>.act()
    }
}