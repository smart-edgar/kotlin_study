package edgar.study.kotlin.perfect.chapter04

object Application {
    const val name = "My Application"
    override fun toString() = name
//    fun exit() { }
}

//fun describe(app: Application) = app.name

fun main() {
    println(Application)

    fun midPoint(xr: IntRange, yr: IntRange) = object {
        val x = (xr.first + xr.last) / 2
        val y = (yr.first + yr.last) / 2
    }
    val midPoint = midPoint(1..5, 2..6)

    println("${midPoint.x}, ${midPoint.y}")
}