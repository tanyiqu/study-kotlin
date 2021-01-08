class Address {
    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"

    override fun toString(): String {
        return "Address(name='$name', street='$street', city='$city', state=$state, zip='$zip')"
    }


}

fun copyAddress(address: Address): Address {
    val result = Address() // Kotlin 中没有“new”关键字
    result.name = address.name // 将调用访问器
    result.street = address.street
    return result
}

fun main(args: Array<String>) {
    var add = Address();
    println(add.name)

    var add2 = copyAddress(add);
    println(add2)
}