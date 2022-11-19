package edgar.study.kotlin.libraryapp.service.user

import edgar.study.kotlin.libraryapp.domain.user.UserRepository
import edgar.study.kotlin.libraryapp.dto.user.request.UserCreateRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class UserServiceTest  constructor(
    @Autowired private val userService: UserService,
    @Autowired private val userRepository: UserRepository
) {
    @Test
    fun userSaveTest() {
        //given
        val request = UserCreateRequest("유저명", null)

        //when
        userService.saveUser(request)

        //then
        val users = userRepository.findAll()
        assertThat(users).hasSize(1)
        assertThat(users[0].name).isEqualTo("유저명")
        assertThat(users[0].age).isNull()
    }
}