package edgar.study.kotlin.effective.chapter04.item27

//interface MessageDisplay {
//    fun show(
//        message: String,
//        duration: MessageLength = MessageLength.LONG
//    )
//}
//class ToastDisplay(
//    val context: Context
//) : MessageDisplay {
//    override fun show(message: String, duration: MessageLength) {
//        val toastDuration = when(duration) {
//            MessageLength.SHORT -> Length.SHORT
//            MessageLength.LONG -> Length.LONG
//        }
//        Toast.makeText(context, message, toastDuration)
//            .show()
//    }
//}
//
//enum class MessageLength {
//    SHORT,
//    LONG
//}
