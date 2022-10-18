package edgar.study.kotlin.perfect.chapter03

import kotlin.math.PI

fun circleArea(radius: Double): Double {
    return PI * radius * radius
}

fun circleArea2(radius: Double): Double = PI * radius * radius

fun circleArea3(radius: Double) = PI * radius * radius

fun circleArea4(radius: Double) = { PI * radius * radius }

//타입 불일치
//fun circleArea5(radius: Double) = {
//    return PI * radius * radius
//}

fun main() {
    print("Enter radius : ")
    val radius = readLine()!!.toDouble()
    println("Circle Area: ${circleArea(radius)}")
}