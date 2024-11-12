package edgar.study.kotlin.effective.item08

//val printer: Printer? = getPrinter()
//printer.print() //컴파일 오류
//
//printer?.print() //안전 호출
//if (printer != null) printer.print() //스마트 캐스팅
//printer!!.print() //not-null assertion

//val printerName1 = printer?.name ?: "Unnamed"
//val printerName2 = printer?.name ?: return
//val printerName3 = printer?.name ?: throw Error("Printer must be named")

//println("wat is your name?")
//val name = readLine()
//if (!name.isNullOrBlank()) {
//    println("Hello ${name.uppercase()}")
//}

//val news: List<News>? = getNews()
//if (!news.isNullOrEmpty()) {
//    news.forEach { notifyUser(it) }
//}
