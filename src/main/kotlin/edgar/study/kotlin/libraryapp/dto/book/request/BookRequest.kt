package edgar.study.kotlin.libraryapp.dto.book.request

import edgar.study.kotlin.libraryapp.type.BookType

data class BookRequest constructor(
    val name: String,
    val type: BookType
)