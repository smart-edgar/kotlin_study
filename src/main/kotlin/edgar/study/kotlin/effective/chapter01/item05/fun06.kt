package edgar.study.kotlin.effective.chapter01.item05

//public inline fun require(value: Boolean): Unit {
//    contract {
//        returns() implies value
//    }
//    require(value) { "Failed requirement."}
//}
//
//fun changeDress(person: Person) {
//    require(person.outfit is Dress)
//    val dress: Dress = person.dress
//}
//
//class Person(val email: String?)
//
//fun sendEmail(person: Person, message: String) {
//    require(person.email != null)
//    val email: String = person.email
//}
//
//fun validateEmail(email: String) {}
//
//fun sendEmail1(person: Person, text: String) {
//    val email = requireNotNull(person.email)
//    validateEmail(email)
//}
//
//fun sendEmail2(person: Person, text: String) {
//    requireNotNull(person.email)
//    validateEmail(person.email)
//}
//
//fun sendEmail3(person: Person, text: String) {
//    val email: String = person.email ?: run {
//        log("Email not send, not email address")
//        return
//    }
//}
