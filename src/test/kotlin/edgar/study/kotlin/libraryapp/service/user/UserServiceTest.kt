package edgar.study.kotlin.libraryapp.service.user

import edgar.study.kotlin.libraryapp.domain.user.User
import edgar.study.kotlin.libraryapp.domain.user.UserRepository
import edgar.study.kotlin.libraryapp.domain.user.loanhistory.UserLoanHistory
import edgar.study.kotlin.libraryapp.domain.user.loanhistory.UserLoanHistoryRepository
import edgar.study.kotlin.libraryapp.dto.user.request.UserCreateRequest
import edgar.study.kotlin.libraryapp.dto.user.request.UserUpdateRequest
import edgar.study.kotlin.libraryapp.type.UserLoanStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class UserServiceTest  constructor(
    @Autowired private val userService: UserService,
    @Autowired private val userRepository: UserRepository,
    @Autowired private val userLoanHistoryRepository: UserLoanHistoryRepository
) {

    @AfterEach
    fun clearData() {
        userRepository.deleteAll()
    }

    @Test
    @DisplayName("유저 저장 : 정상")
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

    @Test
    @DisplayName("유저 리스트 조회 : 정상")
    fun getUsersTest() {
        //given
        userRepository.save(User("A", 20))
        userRepository.save(User("B", 25))

        //when
        val users = userService.getUsers()

        //then
        assertThat(users).hasSize(2)

        assertThat(users).extracting("name").containsExactlyInAnyOrder("A", "B")
        assertThat(users).extracting("age").containsExactlyInAnyOrder(20, 25)
    }

    @Test
    @DisplayName("유저 이름 수정 : 정상")
    fun updateUserNameTest() {
        //given
        val user = userRepository.save(User("AA", 20))
        val request = UserUpdateRequest(user.id!!, "BB")

        //when
        userService.updateUserName(request)

        //then
        val updatedUser = userRepository.findById(user.id).orElseThrow()
        assertThat(updatedUser.name).isEqualTo("BB")
    }

    @Test
    @DisplayName("유저 삭제 : 정상")
    fun deleteUserTest() {
        //given
        userRepository.save(User("AAA", 20))

        //when
        userService.deleteUser("AAA")

        //then
        assertThat(userRepository.findAll()).isEmpty()
    }

    @Test
    @DisplayName("유저 대출 히스토리 조회(기록 없는 유저) : 정상")
    fun getUsersLoanHistoriesTest1() {
        //given
        userRepository.save(User("BBB", 30))

        //when
        val results = userService.getUsersLoanHistories()

        //then
        assertThat(results).hasSize(1)
        assertThat(results[0].name).isEqualTo("BBB")
        assertThat(results[0].books).isEmpty()
    }

    @Test
    @DisplayName("유저 대출 히스토리 조회(기록 많은 유저) : 정상")
    fun getUsersLoanHistoriesTest2() {
        //given
        val loanUser = userRepository.save(User("CCC", 30))
        userLoanHistoryRepository.saveAll(listOf(
            UserLoanHistory(loanUser, "대출북"),
            UserLoanHistory(loanUser, "반납북1", UserLoanStatus.RETURNED),
            UserLoanHistory(loanUser, "반납북2", UserLoanStatus.RETURNED)
        ))

        //when
        val results = userService.getUsersLoanHistories()

        //then
        assertThat(results).hasSize(1)
        assertThat(results[0].name).isEqualTo("CCC")
        assertThat(results[0].books).hasSize(3)
        assertThat(results[0].books[0].name).isEqualTo("대출북")
        assertThat(results[0].books[0].isReturn).isFalse
        assertThat(results[0].books[1].name).isEqualTo("반납북1")
        assertThat(results[0].books[1].isReturn).isTrue
        assertThat(results[0].books[2].name).isEqualTo("반납북2")
        assertThat(results[0].books[2].isReturn).isTrue
        assertThat(results[0].books).extracting("name").containsExactlyInAnyOrder("대출북", "반납북1", "반납북2")
        assertThat(results[0].books).extracting("isReturn").containsExactlyInAnyOrder(false, true, true)
    }
}