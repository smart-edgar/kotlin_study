package edgar.study.kotlin.effective.chapter05.item33

//abstract class ActivityFactory {
//    abstract fun getIntent(context: Context): Intent
//
//    fun start(context: Context) {
//        val intent = getIntent(context)
//        context.startActivity(intent)
//    }
//
//    fun startForResult(activity: Activity, requestCode: Int) {
//        val intent = getIntent(activity)
//        activity.startActivityForResult(intent, requestCode)
//    }
//}
//
//class MainActivity : AppCompatActivity() {
//    companion object: ActivityFactory() {
//        override fun getIntent(context: Context): Intent = Intent(context, MainActivity::class.java)
//    }
//}
//
//val intent = MainActivity.getIntent(context)
//MainActivity.start(context)
//MainActivity.startForResult(activity, requestCode)
