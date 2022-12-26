package edgar.study.kotlin.libraryapp.domain.user

import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long>, UserRepositoryCustom {

    fun findByName(name: String): User?
}