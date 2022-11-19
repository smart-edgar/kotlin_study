package edgar.study.kotlin.libraryapp.service.book;

import edgar.study.kotlin.libraryapp.domain.book.Book;
import edgar.study.kotlin.libraryapp.domain.book.BookRepository;
import edgar.study.kotlin.libraryapp.domain.user.User;
import edgar.study.kotlin.libraryapp.domain.user.UserRepository;
import edgar.study.kotlin.libraryapp.domain.user.loanhistory.UserLoanHistoryRepository;
import edgar.study.kotlin.libraryapp.dto.book.request.BookLoanRequest;
import edgar.study.kotlin.libraryapp.dto.book.request.BookRequest;
import edgar.study.kotlin.libraryapp.dto.book.request.BookReturnRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookService {

  private final BookRepository bookRepository;
  private final UserRepository userRepository;
  private final UserLoanHistoryRepository userLoanHistoryRepository;

  public BookService(
      BookRepository bookRepository,
      UserRepository userRepository,
      UserLoanHistoryRepository userLoanHistoryRepository
  ) {
    this.bookRepository = bookRepository;
    this.userRepository = userRepository;
    this.userLoanHistoryRepository = userLoanHistoryRepository;
  }

  @Transactional
  public void saveBook(BookRequest request) {
    Book newBook = new Book(request.getName());
    bookRepository.save(newBook);
  }

  @Transactional
  public void loanBook(BookLoanRequest request) {
    Book book = bookRepository.findByName(request.getBookName()).orElseThrow(IllegalArgumentException::new);
    if (userLoanHistoryRepository.findByBookNameAndIsReturn(request.getBookName(), false) != null) {
      throw new IllegalArgumentException("진작 대출되어 있는 책입니다");
    }

    User user = userRepository.findByName(request.getUserName()).orElseThrow(IllegalArgumentException::new);
    user.loanBook(book);
  }

  @Transactional
  public void returnBook(BookReturnRequest request) {
    User user = userRepository.findByName(request.getUserName()).orElseThrow(IllegalArgumentException::new);
    user.returnBook(request.getBookName());
  }

}