package edgar.study.kotlin.effective.chapter02.item16

//val db: Database by lazy { connectionToDb() }

//val Context.preferences: SharedPerferences
//    get() = PreferencesManager.getDefaultSharedPreferences(this)
//
//val Context.inflater: LayoutInflater
//    get() = getSystemService(
//        Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//
//val Context.notificationManager: NotificationManager
//    get() = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager


//이렇게 하지 마세요
//val Tree<Int>.sum: Int
//    get() = when (this) {
//        is Leaf -> value
//        is Node -> left.sum + right.sum
//    }

//fun Tree<Int>.sum(): Int when (this) {
//    is Leaf -> value
//    is Node -> left.sum() + right.sum()
//}
