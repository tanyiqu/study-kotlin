fun main(args: Array<String>) {
    /*** If ***/
    println("/*** If ***/")
    var a: Int = 5
    var b: Int = 10

    // 传统用法
    var m: Int = 5
    if (a < b) m = b
    println(m)

    // With else
    if (a > b) {
        m = a
    } else {
        m = b
    }
    println(m)

    // 作为表达式
    m = if (a > b) a else b
    println(m)

    // 还可以跟表达式
    m = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }
    println(m)
    println()

    /*** When ***/
    println("/*** When ***/")
    var x: Int = 1;
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> { // 注意这个块
            println("x is neither 1 nor 2")
        }
    }

    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }

    when (x) {
        in 1..10 -> print("x is in the range")
        in 11..22 -> print("x is valid")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }
    println("\n")

    /*** For ***/
    println("/*** For ***/")
    for (i in 1..3) {
        print("%d ".format(i))
    }
    println()

    for (i in 6 downTo 0 step 2) {
        print("%d ".format(i))
    }
    println()

    val array1 = arrayOf("a", "b", "c")
    for (i in array1.indices) {
        print(array1[i])
    }
    println()

    val array2 = arrayOf("a", "b", "c")
    for ((index, value) in array2.withIndex()) {
        println("the element at $index is $value")
    }
    println()

    /*** While ***/
    println("/*** While ***/")
    x = 3
    while (x > 0) {
        println(x)
        x--
    }

}