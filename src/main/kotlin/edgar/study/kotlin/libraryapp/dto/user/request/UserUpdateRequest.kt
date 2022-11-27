package edgar.study.kotlin.libraryapp.dto.user.request

data class UserUpdateRequest constructor(
    val id: Long,
    val name: String
)