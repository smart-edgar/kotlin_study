package edgar.study.kotlin.effective.chapter02.item16

interface Person {
    val name: String
}

open class Supercomputer {
    open val theAnswer: Long = 42
}

class AppleComputer : Supercomputer() {
    override val theAnswer: Long = 1_800_275_2273
}
