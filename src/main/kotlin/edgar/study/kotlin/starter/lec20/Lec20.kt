package edgar.study.kotlin.starter.lec20

import edgar.study.kotlin.starter.lec19.Person

fun main() {

    val person = Person("edgar", 42)

    //value1 은 age가 리턴
    val value1 = person.let {
        it.age
    }

    //value2 은 age가 리턴
    val value2 = person.run {
        this.age
    }

    //value3 은 person이 리턴
    val value3 = person.also {
        it.age
    }

    //value4 은 person이 리턴
    val value4 = person.apply {
        this.age
    }

    val value5 = with(person) {
        name
        this.age
    }

    println(value1)
    println(value2)
    println(value3)
    println(value4)
    println(value5)
}

fun printPerson(person: Person?) {
    if (person != null) {
        println(person.name)
        println(person.age)
    }
}

fun printPerson1(person: Person?) {
    person?.let {
        println(it.name)
        println(it.age)
    }
}

/*
let / run = 람다의 결과를 반환
also / apply = 겍체 그 자체를 반환
with =
 */

