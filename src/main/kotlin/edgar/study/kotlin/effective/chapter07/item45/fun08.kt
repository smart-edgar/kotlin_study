package edgar.study.kotlin.effective.chapter07.item45

fun String.isValidIpAddress(): Boolean {
    return this.matches("\\A(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\z".toRegex())
}


private val IS_VALID_EMAIL_REGEX by lazy {
    "\\A(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\z".toRegex()
}
fun String.isValidIpAddress2(): Boolean = matches(IS_VALID_EMAIL_REGEX)

