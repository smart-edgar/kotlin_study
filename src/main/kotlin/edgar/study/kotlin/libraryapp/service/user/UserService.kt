package edgar.study.kotlin.libraryapp.service.user

import edgar.study.kotlin.libraryapp.domain.user.User
import edgar.study.kotlin.libraryapp.domain.user.UserRepository
import edgar.study.kotlin.libraryapp.dto.user.request.UserCreateRequest
import edgar.study.kotlin.libraryapp.dto.user.request.UserUpdateRequest
import edgar.study.kotlin.libraryapp.dto.user.response.UserResponse
import edgar.study.kotlin.libraryapp.util.fail
import edgar.study.kotlin.libraryapp.util.findByIdOrNullThrow
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserService constructor(
    private val userRepository: UserRepository
) {

    @Transactional
    fun saveUser(request: UserCreateRequest) {
        val newUser = User(request.name, request.age)
        userRepository.save(newUser)
    }

    @Transactional(readOnly = true)
    fun getUsers(): List<UserResponse>  {
        return userRepository.findAll()
//            .map { user -> UserResponse.of(user) }
            .map { UserResponse.of(it) }
//            .map(::UserResponse)
    }

    @Transactional
    fun updateUserName(request: UserUpdateRequest) {
        val user = userRepository.findByIdOrNullThrow(request.id)
        user.updateName(request.name)
    }

    @Transactional
    fun deleteUser(name: String) {
        val user = userRepository.findByName(name) ?: fail()
        userRepository.delete(user)
    }
}