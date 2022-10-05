package edgar.study.kotlin.starter.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {
    readFile()

    readFile2("/Users/edgar/IdeaProjects/kotlin_study/src/main/kotlin/edgar/study/kotlin/starter/lec07/test.txt")
}

fun strToInt(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("숫자가 아니에요. : ${str}")
    }
}

fun strToIntOrNull(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

fun readFile() {
    val currentPath = File(".")
    val file = File(currentPath.absolutePath +
            "/src/main/kotlin/edgar/study/kotlin/starter/lec07/test.txt")
    val br: BufferedReader = BufferedReader(FileReader(file))
    println(br.readLine())

    br.close()
}

fun readFile2(path: String) {
    //try with resource 가 없고 use를 사용한다.
    BufferedReader(FileReader(path)).use {
            file ->  file.readLine()}
}