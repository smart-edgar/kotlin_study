package edgar.study.kotlin.perfect.chapter03

fun rectangleArea(width: Double, height: Double): Double {
    return width * height
}

fun main() {
    print("Enter width : ")
    val w = readLine()!!.toDouble()
    print("Enter height : ")
    val h = readLine()!!.toDouble()
    println("Rectangle Area : ${rectangleArea(w, h)}")

    println("Rectangle Area : ${rectangleArea(height = h, width = w)}")
    println()
    println()

    println(swap("Hello", 1, 2))
    println(swap("Hello", f = 1, t = 2))
    println(swap("Hello", t = 3, f = 0))
    println(swap("Hello", 1, t = 3))
    println(swap(f = 1, s = "Hello", t = 2))
    println(swap(s = "Hello", 1, 2))
    println(swap(s = "Hello", 1, t = 2))
//    println(swap(s = "Hello", 2, f = 1)) // Error
//    println(swap(1, 2, s = "Hello")) // Error

}

fun swap(s: String, f: Int, t: Int): String {
    val chars = s.toCharArray()
    val tmp = chars[f]
    chars[f] = chars[t]
    chars[t] = tmp
    return chars.concatToString()
}