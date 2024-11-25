package edgar.study.kotlin.effective.chapter03.item21

//var token: String? by LoggingProperty(null)
//var attempts: Int by LoggingProperty(0)
//
//private class LoggingProperty<T>(var value: T) {
//    operator fun getValue(
//        thisRef: Any?,
//        property: KProperty<*>
//    ): T {
//        println("${property.name} returned value $value")
//        return value
//    }
//
//    operator fun setValue(
//        thisRef: Any?,
//        property: KProperty<*>,
//        newValue: T
//    ) {
//        val name = property.name
//        println("$name changed from $value to $newValue")
//        value = newValue
//    }
//}
//
//
//@JvmField
//private val `token$delegate` =
//    LoggingProperty<String?>(null)
//var token: String?
//    get() = `token$delegate`.getValue(this, ::token)
//    set(value) {
//        `token$delegate`.setValue(this, ::token, value)
//    }
