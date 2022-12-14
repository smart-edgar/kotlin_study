package edgar.study.kotlin.libraryapp.controller.user

import edgar.study.kotlin.libraryapp.dto.user.request.UserCreateRequest
import edgar.study.kotlin.libraryapp.dto.user.request.UserUpdateRequest
import edgar.study.kotlin.libraryapp.dto.user.response.UserLoanHistoryResponse
import edgar.study.kotlin.libraryapp.dto.user.response.UserResponse
import edgar.study.kotlin.libraryapp.service.user.UserService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController constructor(
    private val userService: UserService
) {
    @PostMapping("/user")
    fun saveUser(@RequestBody request: UserCreateRequest) {
        userService.saveUser(request)
    }

    @GetMapping("/user")
    fun getUsers(): List<UserResponse> {
        return userService.getUsers()
    }

    @PutMapping("/user")
    fun updateUserName(@RequestBody request: UserUpdateRequest) {
        userService.updateUserName(request)
    }

    @DeleteMapping("/user")
    fun deleteUser(@RequestParam name: String) {
        userService.deleteUser(name)
    }

    @GetMapping("/user/loan")
    fun getUsersLoanHistories(): List<UserLoanHistoryResponse> {
        return userService.getUsersLoanHistories()
    }
}