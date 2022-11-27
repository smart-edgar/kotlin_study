package edgar.study.kotlin.libraryapp.dto.book.request

data class BookLoanRequest constructor(
    val userName: String,
    val bookName: String
)