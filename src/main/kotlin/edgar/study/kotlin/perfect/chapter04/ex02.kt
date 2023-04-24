package edgar.study.kotlin.perfect.chapter04

fun isLetterString(s: String): Boolean {
    if (s.isEmpty()) return false

    for (ch in s) {
        if (!ch.isLetter()) return false
    }

    return true
}

fun isLetterString2(s: String?): Boolean {
    if (s!!.isEmpty()) return false

    for (ch in s) {
        if (!ch.isLetter()) return false
    }

    return true
}

fun isLetterString3(s: String?): Boolean {
    if (s == null) return false

    if (s.isEmpty()) return false

    for (ch in s) {
        if (!ch.isLetter()) return false
    }

    return true
}

fun describeNumber(n: Int?) = when (n) {
    null -> "null"
    in 0..10 -> "small"
    in 11..100 -> "large"
    else -> "out of range"
}

fun isSingleChar(s: String?) = s != null && s.length == 1



fun isBooleanString(s: String?) = s == "false" || s == "true"

fun main() {
    println(isLetterString("abc"))

    // null safe
    //println(isLetterString(null))
    println(isBooleanString(null))

    // null error
    //println(isLetterString2(null))

    println(isLetterString3(null))

    var name: String? = null

    fun initialize() {
        name = "John"
    }

    fun sayHello() {
        println(name!!.uppercase())
    }

    initialize()
    sayHello()

    sayHello2(name)
    sayHello2(null)

    println(PersonChapter4(Name("John", "Doe")).describe())
    println(PersonChapter4(null).describe())
}

fun sayHello2(name: String?) {
    println("Hello, " + (name ?: "Unknown"))
}


class Name(val firstName: String,
           val familyName: String?)

class PersonChapter4(val name: Name?) {
    fun describe(): String {
        val currentName = name ?: return "Unknown"
        return "${currentName.firstName} ${currentName.familyName}"
    }
}





