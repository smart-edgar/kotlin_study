package edgar.study.kotlin.effective.chapter08.item50

class Student(val name: String?)

// 동작은 합니다.
fun List<Student>.getNames(): List<String> = this
    .map { it.name }
    .filter { it != null }
    .map { it!! }

// 위 보다 좋습니다.
fun List<Student>.getNames2(): List<String> = this
    .map { it.name }
    .filterNotNull()

// 가장 좋습니다.
fun List<Student>.getNames3(): List<String> = this
    .mapNotNull { it.name }
