package edgar.study.kotlin.libraryapp.service.book

import edgar.study.kotlin.libraryapp.domain.book.Book
import edgar.study.kotlin.libraryapp.domain.book.BookRepository
import edgar.study.kotlin.libraryapp.domain.user.UserRepository
import edgar.study.kotlin.libraryapp.dto.book.request.BookLoanRequest
import edgar.study.kotlin.libraryapp.dto.book.request.BookRequest
import edgar.study.kotlin.libraryapp.dto.book.request.BookReturnRequest
import edgar.study.kotlin.libraryapp.dto.book.response.BookStatResponse
import edgar.study.kotlin.libraryapp.repository.book.BookQueryDslRepository
import edgar.study.kotlin.libraryapp.repository.user.loanhistory.UserLoanHistoryQueryDslRepository
import edgar.study.kotlin.libraryapp.type.UserLoanStatus
import edgar.study.kotlin.libraryapp.util.fail
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class BookService constructor(
    private val bookRepository: BookRepository,
    private val bookQueryDslRepository: BookQueryDslRepository,
    private val userRepository: UserRepository,
    private val userLoanHistoryQueryDslRepository: UserLoanHistoryQueryDslRepository
) {

    @Transactional
    fun saveBook(request: BookRequest) {
        val newBook = Book(request.name, request.type)
        bookRepository.save(newBook)
    }

    @Transactional
    fun loanBook(request: BookLoanRequest) {
        val book = bookRepository.findByName(request.bookName) ?: fail()
        if (userLoanHistoryQueryDslRepository.find(request.bookName, UserLoanStatus.LOANED) != null) {
            fail("진작 대출되어 있는 책입니다")
        }
        val user = userRepository.findByName(request.userName) ?: fail()
        user.loanBook(book)
    }

    @Transactional
    fun returnBook(request: BookReturnRequest) {
        val user = userRepository.findByName(request.userName) ?: fail()
        user.returnBook(request.bookName)
    }

    @Transactional(readOnly = true)
    fun countLoanedBook(): Int {
        return userLoanHistoryQueryDslRepository.count(UserLoanStatus.LOANED).toInt()
    }

    @Transactional(readOnly = true)
    fun getBookStat(): List<BookStatResponse> {

        return bookQueryDslRepository.getStats()
    }
}