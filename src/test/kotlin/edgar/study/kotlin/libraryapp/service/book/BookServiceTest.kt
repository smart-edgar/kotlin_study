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
import edgar.study.kotlin.libraryapp.dto.book.response.BookStatResponse
import edgar.study.kotlin.libraryapp.type.BookType
import edgar.study.kotlin.libraryapp.type.UserLoanStatus
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
        assertThat(loanBook[0].status).isEqualTo(UserLoanStatus.LOANED)
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
        assertThat(returnBook[0].status).isEqualTo(UserLoanStatus.RETURNED)
        assertThat(returnBook[0].user.name).isEqualTo("유저3")
    }

    @Test
    @DisplayName("북 대출 권 수 : 정상")
    fun countLoanedBookTest() {
        //given
        bookRepository.saveAll(listOf(
            Book("조회북1", BookType.LANGUAGE),
            Book("조회북2", BookType.LANGUAGE),
            Book("조회북3", BookType.LANGUAGE)
        ))
        val saveUser = userRepository.save(User("유저4", 30))
        userLoanHistoryRepository.saveAll(listOf(
            UserLoanHistory(saveUser, "조회북1"),
            UserLoanHistory(saveUser, "조회북2", UserLoanStatus.RETURNED)
        ))

        //when
        val countBook = bookService.countLoanedBook()

        //then
        assertThat(countBook).isEqualTo(1)
    }

    @Test
    @DisplayName("북 타입 별 통게 : 정상")
    fun getBookStatTest() {
        //given
        bookRepository.saveAll(listOf(
            Book("통계1", BookType.LANGUAGE),
            Book("통계2", BookType.COMPUTER),
            Book("통계3", BookType.COMPUTER),
            Book("통계4", BookType.ECONOMY),
            Book("통계5", BookType.ECONOMY),
            Book("통계6", BookType.ECONOMY),
            Book("통계7", BookType.SCIENCE),
            Book("통계8", BookType.SCIENCE),
            Book("통계9", BookType.SCIENCE),
            Book("통계10", BookType.SCIENCE),
            Book("통계11", BookType.SOCIETY),
            Book("통계12", BookType.SOCIETY),
            Book("통계13", BookType.SOCIETY),
            Book("통계14", BookType.SOCIETY),
            Book("통계15", BookType.SOCIETY)
        ))

        //when
        val bookStats = bookService.getBookStat()

        //than
        assertThat(bookStats).hasSize(5)
        this.getBookStatTestThenCount(bookStats, BookType.LANGUAGE, 1)
        this.getBookStatTestThenCount(bookStats, BookType.COMPUTER, 2)
        this.getBookStatTestThenCount(bookStats, BookType.ECONOMY, 3)
        this.getBookStatTestThenCount(bookStats, BookType.SCIENCE, 4)
        this.getBookStatTestThenCount(bookStats, BookType.SOCIETY, 5)
    }

    private fun getBookStatTestThenCount(
        bookStats: List<BookStatResponse>,
        type: BookType,
        count: Int) {
        assertThat(bookStats.first { res -> res.type == type }.count).isEqualTo(count)
    }
}