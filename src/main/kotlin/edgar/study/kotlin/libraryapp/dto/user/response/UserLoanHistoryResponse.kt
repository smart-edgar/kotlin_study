package edgar.study.kotlin.libraryapp.dto.user.response

import edgar.study.kotlin.libraryapp.domain.user.User
import edgar.study.kotlin.libraryapp.domain.user.loanhistory.UserLoanHistory

data class UserLoanHistoryResponse(
    val name: String, //사용자 이름
    val books: List<BookHistoryResponse> //책 대출 현황
) {
    companion object {
        fun of(user: User): UserLoanHistoryResponse {
            return UserLoanHistoryResponse(
                user.name,
                user.userLoanHistories
                    .map(BookHistoryResponse::of)
            )
        }
    }
}

data class BookHistoryResponse(
    val name: String, //책 이름
    val isReturn: Boolean //책 반납 여부
) {
    companion object {
        fun of(userLoanHistory: UserLoanHistory): BookHistoryResponse {
            return BookHistoryResponse(
                userLoanHistory.bookName,
                userLoanHistory.isReturn
            )
        }
    }
}