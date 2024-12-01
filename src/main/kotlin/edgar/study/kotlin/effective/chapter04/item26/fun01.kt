package edgar.study.kotlin.effective.chapter04.item26

class CoffeeMachine {
    fun makeCoffee() {
        // ===== 수백줄의 복잡한 함수
        // 수백 개의 변수를 선언
        // 복잡한 로직을 처리
        // 낮은 수준의 최적화

        // ===== 추상화 + 이해하기 쉬운 레벨
        boilWater()
        brewCoffee()
        pourCoffee()
        pourMilk()
    }

    fun makeEspressoCoffee() {
        boilWater()
        brewCoffee()
        pourCoffee()
    }

    private fun boilWater() {

    }
    private fun brewCoffee() {

    }
    private fun pourCoffee() {

    }
    private fun pourMilk() {

    }
}
