package edgar.study.kotlin.libraryapp.domain.user.loanhistory

import org.springframework.data.jpa.repository.JpaRepository


interface UserLoanHistoryRepository: JpaRepository<UserLoanHistory, Long> {
}