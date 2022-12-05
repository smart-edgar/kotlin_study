package edgar.study.kotlin.libraryapp.domain.book

import edgar.study.kotlin.libraryapp.type.BookType
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Book constructor(
    val name: String,

    @Enumerated(EnumType.STRING )
    val type: BookType,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
) {
    init {
        if (name.isBlank()) {
            throw IllegalArgumentException("이름은 비어 있을 수 없습니다")
        }

//        if (type()) {
//            throw IllegalArgumentException("타입은 비어 있을 수 없습니다")
//        }
    }
}