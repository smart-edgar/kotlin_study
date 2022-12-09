package edgar.study.kotlin.libraryapp.dto.user.response

data class UserLoanHistoryResponse(
    val name: String, //사용자 이름
    val books: List<BookHistoryResponse> //책 대출 현황
)

data class BookHistoryResponse(
    val name: String, //책 이름
    val isReturn: Boolean //책 반납 여부
)