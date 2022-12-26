package edgar.study.kotlin.libraryapp.domain.user

interface UserRepositoryCustom {

    fun findAllWithLoanHistories(): List<User>
}