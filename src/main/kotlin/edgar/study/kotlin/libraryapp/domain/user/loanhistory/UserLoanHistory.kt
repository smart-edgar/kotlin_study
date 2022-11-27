package edgar.study.kotlin.libraryapp.domain.user.loanhistory

import edgar.study.kotlin.libraryapp.domain.user.User
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class UserLoanHistory constructor(
    @ManyToOne
    val user: User,
    val bookName: String,
    var isReturn: Boolean = false,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
) {
    fun doReturn() {
        this.isReturn = true
    }
}