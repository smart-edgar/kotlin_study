package edgar.study.kotlin.perfect.chapter04

class Person(var firstName: String = "",
             var familyName: String = "") {

    var age: Int = 0

//    constructor(firstName: String, familyName: String) {
//        this.firstName = firstName
//        this.familyName = familyName
//    }

    init {
        println("Created new Person")
        if (firstName.isEmpty()) {
            throw IllegalArgumentException("Invalid firstName")
        }
        if (familyName.isEmpty()) {
            throw IllegalArgumentException("Invalid familyName")
        }
    }

    fun fullName() = "$firstName $familyName"

    fun showMe() {
        println("${fullName()}: $age")
    }
}

fun main() {
    try {
        val person = Person()
        person.firstName = "Edgar"
        person.familyName = "Hong"
        person.age = 43

        person.showMe()
    } catch (e: IllegalArgumentException) {
        println("person3 Exception skip : ${e.message}")
    }

    val person2 = Person("edgar", "hong")
    println(person2.fullName())

    try {
        val person3 = Person("first")
        println(person3.fullName())
    } catch (e: IllegalArgumentException) {
        println("person3 Exception skip : ${e.message}")
    }
    try {
        val person4 = Person(familyName = "family")
        println(person4.fullName())
    } catch (e: IllegalArgumentException) {
        println("person4 Exception skip : ${e.message}")
    }
}