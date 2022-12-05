package edgar.study.kotlin.libraryapp.type

enum class BookType constructor(
    val typeName: String
) {
    SCIENCE("과학"),
    SOCIETY("사회"),
    ECONOMY("경제"),
    COMPUTER("컴퓨터"),
    LANGUAGE("언어")
}