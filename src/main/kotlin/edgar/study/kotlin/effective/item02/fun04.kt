package edgar.study.kotlin.effective.item02

import java.awt.Color

//나쁜 예
fun updateWeather1(degrees: Int) {
    val description: String
    val color: Color
    if (degrees < 5) {
        description = "cold"
        color = Color.BLUE
    } else if (degrees < 23) {
        description = "mild"
        color = Color.YELLOW
    } else {
        description = "hot"
        color = Color.RED
    }
}

//조금 더 좋은 예
fun updateWeather2(degrees: Int) {
    val (description, color) = when {
        degrees < 5 -> "cold" to Color.BLUE
        degrees < 23 -> "mild" to Color.YELLOW
        else -> "hot" to Color.RED
    }
}
