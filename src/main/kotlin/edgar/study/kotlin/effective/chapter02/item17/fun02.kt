package edgar.study.kotlin.effective.chapter02.item17

fun sendEmail(to: String, message: String) { }

fun ex17_1() {
    sendEmail(
        to = "contact@academy.com",
        message = "Hello World!",
    )
}
