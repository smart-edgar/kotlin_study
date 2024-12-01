package edgar.study.kotlin.effective.chapter04.item27

private var nextId: Int = 0
fun getNextId(): Int = nextId++

val newId = getNextId()
