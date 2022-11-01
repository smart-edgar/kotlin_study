package edgar.study.kotlin.perfect.chapter03

import kotlin.random.Random


//fun indexOf(subarray: IntArray, array: IntArray): Int {
//    outerLoop@ for (i in array.indices) {
//        for (j in subarray.indices) {
//            if (subarray[j] != array[i+j]) continue@outerLoop
//        }
//
//        return i
//    }
//    return -1
//}

fun main() {
    val num = Random.nextInt(1, 11)

    loop@ while (true) {
        val guess = Random.nextInt(1, 11)

        println("${num} <-> ${guess}")
        val message = when {
            guess < num -> "Too small"
            guess > num -> "Too big"
            else -> break@loop
        }

        println(message)
    }

    println("Right: it's ${num}")
}