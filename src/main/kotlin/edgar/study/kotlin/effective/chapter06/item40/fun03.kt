package edgar.study.kotlin.effective.chapter06.item40

import java.net.URL

fun main() {
    val enWiki = URL("https://edgar.edgar.im/edgar/index.html")
    val wiki = URL("https://wikipedia.org")
    println(enWiki == wiki)
}
