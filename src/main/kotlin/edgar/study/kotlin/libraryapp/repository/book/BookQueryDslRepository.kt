package edgar.study.kotlin.libraryapp.repository.book

import com.querydsl.core.types.Projections
import com.querydsl.jpa.impl.JPAQueryFactory
import edgar.study.kotlin.libraryapp.domain.book.QBook.book
import edgar.study.kotlin.libraryapp.dto.book.response.BookStatResponse
import org.springframework.stereotype.Component

@Component
class BookQueryDslRepository(
    private val queryFactory: JPAQueryFactory
) {

    fun getStats(): List<BookStatResponse> {
        return queryFactory
            .select(
                Projections.constructor(
                    BookStatResponse::class.java,
                    book.type,
                    book.id.count()
                )
            )
            .from(book)
            .groupBy(book.type)
            .fetch()
    }

}