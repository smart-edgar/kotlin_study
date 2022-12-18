package edgar.study.kotlin.libraryapp.dto.book.response

import edgar.study.kotlin.libraryapp.type.BookType

data class BookStatResponse(
    val type: BookType,
    var count: Int
) {
    fun plus() {
        count++
    }
}
