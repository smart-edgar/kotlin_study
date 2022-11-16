package edgar.study.kotlin.libraryapp

import org.junit.jupiter.api.*

class JunitTest {

    companion object {
        @JvmStatic
        @BeforeAll
        fun beforeAll() {
            println("beforeAll")
        }

        @JvmStatic
        @AfterAll
        fun afterAll() {
            println("afterAll")
        }
    }

    @BeforeEach
    fun beforeEach() {
        println("beforeEach")
    }

    @AfterEach
    fun afterEach() {
        println("afterEach")
    }

    @Test
    fun test1() {
        println("test 1")
    }

    @Test
    fun test2() {
        println("test 2")
    }


}