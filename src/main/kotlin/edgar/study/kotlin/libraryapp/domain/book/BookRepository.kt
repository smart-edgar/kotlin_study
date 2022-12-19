package edgar.study.kotlin.libraryapp.domain.book

import edgar.study.kotlin.libraryapp.dto.book.response.BookStatResponse
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface BookRepository: JpaRepository<Book, Long> {

    fun findByName(bookName: String): Book?

    @Query("SELECT NEW edgar.study.kotlin.libraryapp.dto.book.response.BookStatResponse(b.type, COUNT(b.id)) FROM Book b GROUP BY b.type")
    fun getStats(): List<BookStatResponse>
}