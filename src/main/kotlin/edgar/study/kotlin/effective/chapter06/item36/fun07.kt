package edgar.study.kotlin.effective.chapter06.item36

open class Parent {
    fun a() {}
    open fun b() {}
}

class Child : Parent() {
    //override fun a() { } //에러
    override fun b() { }
}
