package edgar.study.kotlin.libraryapp.repository.user.loanhistory

import com.querydsl.jpa.impl.JPAQueryFactory
import edgar.study.kotlin.libraryapp.domain.user.loanhistory.QUserLoanHistory.userLoanHistory
import edgar.study.kotlin.libraryapp.domain.user.loanhistory.UserLoanHistory
import edgar.study.kotlin.libraryapp.type.UserLoanStatus
import org.springframework.stereotype.Component

@Component
class UserLoanHistoryQueryDslRepository(
    private val queryFactory: JPAQueryFactory
) {

    fun find(bookName: String, status: UserLoanStatus? = null): UserLoanHistory? {
        return queryFactory.select(userLoanHistory)
            .from(userLoanHistory)
            .where(
                userLoanHistory.bookName.eq(bookName),
                status?.let { userLoanHistory.status.eq(status) }
            )
            .limit(1)
            .fetchOne()
    }

    fun count(status: UserLoanStatus): Long {
        return queryFactory.select(userLoanHistory.id.count())
            .from(userLoanHistory)
            .where(userLoanHistory.status.eq(status))
            .fetchOne() ?: 0L
    }
}