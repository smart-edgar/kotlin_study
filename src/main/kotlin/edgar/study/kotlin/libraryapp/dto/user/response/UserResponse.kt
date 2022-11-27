package edgar.study.kotlin.libraryapp.dto.user.response

import edgar.study.kotlin.libraryapp.domain.user.User

data class UserResponse constructor(
    val id: Long,
    val name: String,
    val age: Int?
) {
    companion object {
        fun of(user: User): UserResponse {
            return UserResponse(
                id = user.id!!,
                name = user.name,
                age = user.age
            )
        }
    }
//    constructor(user: User): this(
//        id = user.id!!,
//        name = user.name,
//        age = user.age
//    )
}