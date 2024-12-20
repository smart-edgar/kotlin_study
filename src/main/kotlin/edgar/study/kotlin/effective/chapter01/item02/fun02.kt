package edgar.study.kotlin.effective.chapter01.item02

import edgar.study.kotlin.effective.chapter01.item01.User

fun main() {

    var users: List<edgar.study.kotlin.effective.chapter01.item01.User> = listOf()

    //나쁜 예
    var user: edgar.study.kotlin.effective.chapter01.item01.User
    for (i in users.indices) {
        user = users[i]
        println("User at $i is $user")
    }

    //조금 더 좋은 예
    for (i in users.indices) {
        val user1 = users[i]
        println("User at $i is $user1")
    }

    //제일 좋은 예
    for ((i, user2) in users.withIndex()) {
        println("User at $i is $user2")
    }

}
