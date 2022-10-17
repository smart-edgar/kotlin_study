package edgar.study.kotlin.starter.lec12

class Person private constructor(
    val name: String,
    val age: Int) {

    companion object PersonFactory: Log{
        private const val MIN_AGE: Int = 1
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("Person.log()")
        }
    }
 }