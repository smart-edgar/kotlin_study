package edgar.study.kotlin.libraryapp.util

import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.findByIdOrNull

fun fail(): Nothing {
    throw IllegalArgumentException()
}

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

fun <T, ID> CrudRepository<T, ID>.findByIdOrNullThrow(id: ID): T {
    return this.findByIdOrNull(id) ?: fail()
}