package edgar.study.kotlin.effective.chapter03.item21

//class SwipeRefreshBinderDelegate(val id: Int) {
//    private var cache: SwipeRefreshLayout? = null
//
//    operator fun getValue(
//        thisRef: Any?,
//        property: KProperty<*>
//    ): SwipeRefreshLayout {
//        return cache ?: activity.findViewById<SwipeRefreshLayout>(id)
//            .also { cache = it}
//    }
//
//    operator fun getValue(
//        fragment: Fragment,
//        prop: KProperty<*>
//    ): SwipeRefreshLayout {
//        return cache ?: fragment.view.findViewById<ShipreRefreshLayout>(id)
//            .also { cache = it }
//    }
//}
