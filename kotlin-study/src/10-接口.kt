interface MyInterface {
    fun bar()
    fun foo() {
        println("foo")
    }
}


class Child : MyInterface {
    override fun bar() {
        println("implement bar")
    }

}


fun main() {
    val child = Child()
    child.foo()
    child.bar()
}