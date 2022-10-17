package edgar.study.kotlin.starter.lec14

sealed class CarSealed(
    val name: String,
    val price: Long) {

    class A : CarSealed("소형", 1_000L)
    class B : CarSealed("준중형", 2_000L)
}