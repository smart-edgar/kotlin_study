package edgar.study.kotlin.libraryapp.domain.book

import org.springframework.data.jpa.repository.JpaRepository

interface BookRepository: JpaRepository<Book, Long> {

    fun findByName(bookName: String): Book?
}