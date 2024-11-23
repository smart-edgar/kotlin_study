package edgar.study.kotlin.effective.chapter02.item18

class Student {
    fun isPassing(): Boolean =
        calculatePointsFromPassedCourses() > 15

    fun qualifiesForScholarship(): Boolean =
        calculatePointsFromPassedCourses() > 30

    private fun calculatePointsFromPassedCourses(): Int {
        // ...
        return 5
    }

    fun Student.qualifiesForScholarship(): Boolean {
        // ...
        return true
    }

    fun Student.calculatePointsFromPassedCourses(): Boolean {
        // ...
        return true
    }
}
