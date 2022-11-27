package edgar.study.kotlin.libraryapp.controller.book

import edgar.study.kotlin.libraryapp.dto.book.request.BookLoanRequest
import edgar.study.kotlin.libraryapp.dto.book.request.BookRequest
import edgar.study.kotlin.libraryapp.dto.book.request.BookReturnRequest
import edgar.study.kotlin.libraryapp.service.book.BookService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class BookController constructor(
    private val bookService: BookService
) {
    @PostMapping("/book")
    fun saveBook(@RequestBody request: BookRequest) {
        bookService.saveBook(request)
    }

    @PostMapping("/book/loan")
    fun loanBook(@RequestBody request: BookLoanRequest) {
        bookService.loanBook(request)
    }

    @PutMapping("/book/return")
    fun returnBook(@RequestBody request: BookReturnRequest) {
        bookService.returnBook(request)
    }
}