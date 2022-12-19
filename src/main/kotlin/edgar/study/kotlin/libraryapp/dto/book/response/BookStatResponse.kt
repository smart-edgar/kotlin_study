package edgar.study.kotlin.libraryapp.dto.book.response

import edgar.study.kotlin.libraryapp.type.BookType

data class BookStatResponse(
    val type: BookType,
    val count: Long
)
