package edgar.study.kotlin.effective.chapter01.item08

//fun process(user: User) {
//    requireNotNull(user.name)
//    val context = checkNotNull(context)
//    val networkService = getNetworkServie(context) ?: throw NoInternetConnection()
//    networkService.getData { data, userData ->
//        show(data!!, userData!!)
//    }
//}

//fun largestOf(a: Int, b: Int, c: Int, d: Int): Int {
//    listOf(a, b, c, d).max()!!
//}

//fun largestOf(vararg nums: Int): Int = nums.max()!!

//class UserControllerTest {
//    private val dao: UserDao? = null
//    private val controller: UserController? = null
//
//    @BeforeEach
//    fun init() {
//        dao = mockk()
//        controller = UserController(dao!!)
//    }
//
//    @Test
//    fun test() {
//        controller!!.doSomething()
//    }
//}
