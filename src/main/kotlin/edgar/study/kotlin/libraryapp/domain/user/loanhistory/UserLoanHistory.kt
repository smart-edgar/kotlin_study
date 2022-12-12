package edgar.study.kotlin.libraryapp.domain.user.loanhistory

import edgar.study.kotlin.libraryapp.domain.user.User
import edgar.study.kotlin.libraryapp.type.UserLoanStatus
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
    var status: UserLoanStatus = UserLoanStatus.LOANED,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
) {
    val isReturn: Boolean
        get() = this.status == UserLoanStatus.RETURNED

    fun doReturn() {
        this.status = UserLoanStatus.RETURNED
    }
}