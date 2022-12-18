package edgar.study.kotlin.libraryapp.domain.user.loanhistory

import edgar.study.kotlin.libraryapp.type.UserLoanStatus
import org.springframework.data.jpa.repository.JpaRepository


interface UserLoanHistoryRepository: JpaRepository<UserLoanHistory, Long> {

    fun findByBookNameAndStatus(bookName: String, status: UserLoanStatus): UserLoanHistory?

    fun findAllByStatus(status: UserLoanStatus): List<UserLoanHistory>
}