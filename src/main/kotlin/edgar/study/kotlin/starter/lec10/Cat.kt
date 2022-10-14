package edgar.study.kotlin.starter.lec10

class Cat(
    species: String) : Animal(species, 4) {

    override fun move() {
        println("${this.species} 고양이가 사푼사푼 걸어갑니다.")
    }
}