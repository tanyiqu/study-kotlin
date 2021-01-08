class Invoice {
    constructor() {
        println("Constructor 1")
    }

    constructor(i: Int) {
        println("Constructor 2")
    }
}

open class A() {
    init {
        println("constructor A")
    }

    open fun run() {
        println("run A")
    }
}

class B() : A() {
    init {
        println("constructor B")
    }

    override fun run() {
        println("run B")
    }
}

fun main(args: Array<String>) {
    val invoice1 = Invoice()
    val invoice2 = Invoice(2)

    val b = B();
    b.run()
}