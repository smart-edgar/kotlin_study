package edgar.study.kotlin.perfect.chapter04

import edgar.study.kotlin.perfect.chapter04.util.prefix

fun main() {
    val name = readLine() ?: return
    println("$prefix$name")
}