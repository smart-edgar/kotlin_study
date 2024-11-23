package edgar.study.kotlin.effective.chapter03.item20

import kotlin.random.Random

val numberFromUser = Random.nextInt()

val percent = when {
    numberFromUser > 100 -> 100
    numberFromUser < 0 -> 0
    else -> numberFromUser
}

val percent2 = numberFromUser.coerceIn(0, 100)
