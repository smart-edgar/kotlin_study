package edgar.study.kotlin.libraryapp.calculator

fun main() {
    val test = CalculatorTest()
    test.plusTest()
    test.minusTest()
    test.multiplyTest()
    test.divideTest()
    test.divideFailTest()
}


class CalculatorTest {

    fun plusTest() {
        //given
        val cals = Calculator(5)

        //when
        cals.plus(3)

        //then
        val prediction: Int = 8
        if (prediction == cals.finish() && prediction == cals.number) {
            println("plusTest 정상입니다.")
        } else {
            println("plusTest 실패입니다.")
        }
    }

    fun minusTest() {
        //given
        val cals = Calculator(5)

        //when
        cals.minus(3)

        //then
        val prediction: Int = 2
        if (prediction == cals.finish() && prediction == cals.number) {
            println("minusTest 정상입니다.")
        } else {
            println("minusTest 실패입니다.")
        }
    }

    fun multiplyTest() {
        //given
        val cals = Calculator(5)

        //when
        cals.multiply(3)

        //then
        val prediction: Int = 15
        if (prediction == cals.finish() && prediction == cals.number) {
            println("multiplyTest 정상입니다.")
        } else {
            println("multiplyTest 실패입니다.")
        }
    }

    fun divideTest() {
        //given
        val cals = Calculator(5)

        //when
        cals.divide(2)

        //then
        val prediction: Int = 2
        if (prediction == cals.finish() && prediction == cals.number) {
            println("divideTest 정상입니다.")
        } else {
            println("divideTest 실패입니다.")
        }
    }

    fun divideFailTest() {
        //given
        val cals = Calculator(5)

        //when
        try {
            cals.divide(0)
            println("divideFailTest 실패입니다.")
        } catch (e: IllegalArgumentException) {
            println("divideFailTest 정상입니다.")
        }
    }
}