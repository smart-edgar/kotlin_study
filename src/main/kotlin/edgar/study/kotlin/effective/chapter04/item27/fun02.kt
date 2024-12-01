package edgar.study.kotlin.effective.chapter04.item27

//class ch04_item27_02 {
//    fun show(
//        message: String,
//        duration: MessageLength = MessageLength.LONG
//    ) {
//        val toastDuration = when (duration) {
//            SHORT -> Length.SHORT
//            LONG -> Length.LONG
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
//
//val messageDisplay = MessageDisplay(context)
//messageDisplay.show("Message")
