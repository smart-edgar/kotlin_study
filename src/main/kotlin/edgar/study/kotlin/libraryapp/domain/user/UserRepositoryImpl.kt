package edgar.study.kotlin.libraryapp.domain.user

import com.querydsl.jpa.impl.JPAQueryFactory
import edgar.study.kotlin.libraryapp.domain.user.QUser.user
import edgar.study.kotlin.libraryapp.domain.user.loanhistory.QUserLoanHistory.userLoanHistory

class UserRepositoryImpl(
    private val queryFactory: JPAQueryFactory
): UserRepositoryCustom {

    override fun findAllWithLoanHistories(): List<User> {
        return queryFactory.select(user).distinct()
            .from(user)
            .leftJoin(userLoanHistory).on(userLoanHistory.user.id.eq(user.id)).fetchJoin()
            .fetch()
    }
}