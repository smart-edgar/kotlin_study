package edgar.study.kotlin.starter.lec09

fun main() {
    kotlinPerson()
    println()
    javaPerson()
    println()
    kotlinPerson2()
    println()
    kotlinPerson3()
    println()
    kotlinPerson4()
}

fun kotlinPerson() {
    val person = Person("Edgar", 42)
    println("${person.name}는 ${person.age}세 입니다.")

    person.age+=1
    println("${person.name}는 내년에 ${person.age}세 입니다.")
}

fun javaPerson() {
    val person = JavaPerson("SeungA", 8)
    println("${person.name}는 ${person.age}세 입니다.")

    person.age+=1
    println("${person.name}는 내년에 ${person.age}세 입니다.")
}

fun kotlinPerson2() {
    try {
        val person = Person("ghost", -1)
    } catch (e: Exception) {
        println(e.message)
    }
}

fun kotlinPerson3() {
    val person = Person("NewBaby")
    println("${person.name}는 ${person.age}세 입니다.")

    person.age+=1
    println("${person.name}는 내년에 ${person.age}세 입니다.")
}

fun kotlinPerson4() {
    val person = Person()
    println("${person.name}는 ${person.age}세 입니다.")

    person.age+=1
    println("${person.name}는 내년에 ${person.age}세 입니다.")
}
