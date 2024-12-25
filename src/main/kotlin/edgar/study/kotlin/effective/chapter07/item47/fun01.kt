package edgar.study.kotlin.effective.chapter07.item47

inline class StudentId(val studentId: Int)
inline class TeacherId(val teacherId: Int)
inline class SchoolId(val studentId: Int)

class Grades(
    val studentId: StudentId,
    val teacherId: TeacherId,
    val schoolId: SchoolId,
)
