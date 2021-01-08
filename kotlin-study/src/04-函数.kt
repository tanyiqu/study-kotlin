// 普通函数
fun double(x: Int): Int {
    return 2 * x
}


// 带默认值的函数
fun foo(bar: Int = 0, baz: Int): Int {
    return bar + baz;
}


// Unit函数
fun printHello(name: String?): Unit {
    if (name != null)
        println("Hello $name")
    else
        println("Hi there!")
    // `return Unit` 或者 `return` 是可选的
}


// 单表达式函数
fun triple(x: Int): Int = x * 3

fun quadruple(x: Int) = x * 4


// 可变参数
fun add(vararg param: Int): Int {
    var sum = 0;
    for (i in param) {
        sum += i
    }
    return sum
}


fun main(args: Array<String>) {
    println(double(4))

    println(foo(1, 2))
    println(foo(bar = 1, baz = 2))
    println(foo(baz = 2))


    printHello("Tanyiqu");

    println(triple(2))
    println(quadruple(4))

    println(add(1, 2, 3, 4))
}