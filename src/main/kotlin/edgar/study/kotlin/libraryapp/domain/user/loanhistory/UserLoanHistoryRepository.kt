package edgar.study.kotlin.libraryapp.domain.user.loanhistory

import org.springframework.data.jpa.repository.JpaRepository


interface UserLoanHistoryRepository: JpaRepository<UserLoanHistory, Long> {

    fun findByBookNameAndIsReturn(bookName: String, isReturn: Boolean): UserLoanHistory?
}