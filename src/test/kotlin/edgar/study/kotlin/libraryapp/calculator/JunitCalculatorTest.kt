package edgar.study.kotlin.libraryapp.calculator

import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class JunitCalculatorTest {

    @Test
    fun plusTest() {
        //given
        val cals = Calculator(5)

        //when
        cals.plus(3)

        //then
        assertThat(cals.finish()).isEqualTo(8)
    }

    @Test
    fun minusTest() {
        //given
        val cals = Calculator(5)

        //when
        cals.minus(3)

        //then
        assertThat(cals.finish()).isEqualTo(2)
    }

    @Test
    fun multiplyTest() {
        //given
        val cals = Calculator(5)

        //when
        cals.multiply(3)

        //then
        assertThat(cals.finish()).isEqualTo(15)
    }

    @Test
    fun divideTest() {
        //given
        val cals = Calculator(5)

        //when
        cals.divide(2)

        //then
        assertThat(cals.finish()).isEqualTo(2)
    }

    @Test
    fun divideFailTest() {
        //given
        val cals = Calculator(5)

//        //when
//        val message = assertThrows<IllegalArgumentException> {
//            cals.divide(0)
//        }.message
//        //then
//        assertThat(message).isEqualTo("0으로 나눌 수 없습니다.")

        //when & then
        assertThrows<IllegalArgumentException> {
            cals.divide(0)
        }.apply {
            assertThat(message).isEqualTo("0으로 나눌 수 없습니다.")
        }
    }
}