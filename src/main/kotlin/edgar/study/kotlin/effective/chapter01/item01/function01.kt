package edgar.study.kotlin.effective.chapter01.item01

class BankAccount {
    var balance = 0.0
        private set

    fun deposit(depositAmount: Double) {
        balance += depositAmount
    }

    fun withdraw(withdrawAmount: Double) {
        if (balance < withdrawAmount) {
            throw edgar.study.kotlin.effective.chapter01.item01.InsufficientFunds()
        }
        balance -= withdrawAmount
    }

}

class InsufficientFunds : Exception()
fun main() {
    val account = edgar.study.kotlin.effective.chapter01.item01.BankAccount()
    println(account.balance)
    account.deposit(100.0)
    println(account.balance)
    account.withdraw(50.0)
    println(account.balance)
}
