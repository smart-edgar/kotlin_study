package edgar.study.kotlin.starter.lec04

data class KotlinMoney(
    val amount: Long
) {
    operator fun plus(o: KotlinMoney): KotlinMoney {
        return KotlinMoney(this.amount + o.amount)
    }

    operator fun compareTo(o: KotlinMoney): Int {
        return when {
            this.amount > o.amount -> 1
            this.amount < o.amount -> -1
            else -> 0
        }
    }
}
