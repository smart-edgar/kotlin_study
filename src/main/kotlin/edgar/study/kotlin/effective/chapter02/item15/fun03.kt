package edgar.study.kotlin.effective.chapter02.item15

@DslMarker
annotation class HtmlDsl

fun table(f: TableDsl.() -> Unit) { }

@HtmlDsl
class TableDsl
