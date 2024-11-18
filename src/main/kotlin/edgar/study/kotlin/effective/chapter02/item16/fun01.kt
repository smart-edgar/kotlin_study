package edgar.study.kotlin.effective.chapter02.item16

//코틀린의 프로퍼티
//var name: String? = null
// 자바의 필드
//String name = null;

var name: String? = null
    get() = field?.uppercase()
    set(value) {
        if (!value.isNullOrBlank()) {
            field = value
        }
    }

//var date: Date
//    get() = Date(millis)
//    set(value) {
//        millis = value.time
//    }

