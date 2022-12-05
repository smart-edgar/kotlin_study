package edgar.study.kotlin.libraryapp.service.book

import edgar.study.kotlin.libraryapp.domain.book.Book
import edgar.study.kotlin.libraryapp.domain.book.BookRepository
import edgar.study.kotlin.libraryapp.domain.user.User
import edgar.study.kotlin.libraryapp.domain.user.UserRepository
import edgar.study.kotlin.libraryapp.domain.user.loanhistory.UserLoanHistory
import edgar.study.kotlin.libraryapp.domain.user.loanhistory.UserLoanHistoryRepository
import edgar.study.kotlin.libraryapp.dto.book.request.BookLoanRequest
import edgar.study.kotlin.libraryapp.dto.book.request.BookRequest
import edgar.study.kotlin.libraryapp.dto.book.request.BookReturnRequest
import edgar.study.kotlin.libraryapp.type.BookType
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class BookServiceTest @Autowired constructor(
    private val bookService: BookService,
    private val bookRepository: BookRepository,
    private val userRepository: UserRepository,
    private val userLoanHistoryRepository: UserLoanHistoryRepository
){

    @AfterEach
    fun clearBook() {
        bookRepository.deleteAll()
        userRepository.deleteAll()
    }

    @Test
    @DisplayName("북 저장 : 정상")
    fun saveBookTest() {
        //given
        val request = BookRequest("저장북", BookType.LANGUAGE)
        //when
        bookService.saveBook(request)

        //then
        val books = bookRepository.findAll()

        assertThat(books).hasSize(1)
        assertThat(books[0].name).isEqualTo("저장북")
//        assertThat(books[0].type).isEqualTo(BookType.LANGUAGE)
    }

    @Test
    @DisplayName("북 대출 : 정상")
    fun loanBookTest() {
        //given
        bookRepository.save(Book("대출북", BookType.LANGUAGE))
        userRepository.save(User("유저1", 20))
        val request = BookLoanRequest("유저1", "대출북")

        //when
        bookService.loanBook(request)

        //then
        val loanBook = userLoanHistoryRepository.findAll()

        assertThat(loanBook).hasSize(1)
        assertThat(loanBook[0].bookName).isEqualTo("대출북")
        assertThat(loanBook[0].isReturn).isFalse
        assertThat(loanBook[0].user.name).isEqualTo("유저1")
    }

    @Test
    @DisplayName("북 대출 : 실패")
    fun loanBookFailTest() {
        //given
        bookRepository.save(Book("대출실패북", BookType.LANGUAGE))
        val saveUser = userRepository.save(User("유저2", 20))
        userLoanHistoryRepository.save(UserLoanHistory(saveUser, "대출실패북"))
        val request = BookLoanRequest("유저2", "대출실패북")

        //when & then
        assertThrows<IllegalArgumentException> {
            bookService.loanBook(request)
        }.apply {
            println(message)
            assertThat(message).isEqualTo("진작 대출되어 있는 책입니다")
        }
    }

    @Test
    @DisplayName("북 반납 : 정상")
    fun returnBookTest() {
        //given
        bookRepository.save(Book("반납북", BookType.LANGUAGE))
        val saveUser = userRepository.save(User("유저3", 20))
        userLoanHistoryRepository.save(UserLoanHistory(saveUser, "반납북"))
        val request = BookReturnRequest("유저3", "반납북")

        //when
        bookService.returnBook(request)

        //then
        val returnBook = userLoanHistoryRepository.findAll()
        assertThat(returnBook).hasSize(1)
        assertThat(returnBook[0].bookName).isEqualTo("반납북")
        assertThat(returnBook[0].isReturn).isTrue
        assertThat(returnBook[0].user.name).isEqualTo("유저3")
    }
}