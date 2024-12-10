package edgar.study.kotlin.effective.chapter05.item34

class User(var name: String, var surname: String)
val user = User("Marcin", "Moskala")

data class Student(
   val name: String,
    val surname: String,
    val age: Int,
)

//class OuotationPresenter(
//    private val view: QuotationView,
//    private val repo: QuotationRepository,
//) {
//    private var nextQuoteId = -1
//
//    fun onStart() {
//        onNext()
//    }
//
//    fun onNext() {
//        nextQuoteId = (nextQuoteId + 1) % repo.quotestNumber
//        val quote = repo.getQuote(nextQuoteId)
//        view.showQuote(quote)
//    }
//}
