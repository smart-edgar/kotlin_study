package edgar.study.kotlin.effective.chapter03.item21

// 안드로이드에서의 뷰와 리소스 바인딩
//private val button: Button by bindView(R.id.button)
//private val textSize by bindDimension(R.dimen.font_size)
//private val doctor: Doctor by argExtra(DOCTOR_ARG)

// Koin에서의 종속성 주입
//private val presenter: MainPresenter by inject()
//private val repository: NetworkRepository by inject()
//private val vm: MainViewModel by viewModel()

// 데이터 바인딩
//private val port by bindConfiguration("port")
//private val token: String by perferences.bind(TOKEN_KEY)

var token: String? = null
    get() {
        println("token returned value $field")
        return field
    }
    set(value) {
        println("token changed from $field to $value")
        field = value
    }

var attempts: Int = 0
    get() {
        println("attempts returned value $field")
        return field
    }
    set(value) {
        println("attempts changed from $field to $value")
        field = value
    }
