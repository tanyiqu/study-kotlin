class AA {
    inner class aa(var name: String) {

        override fun toString(): String {
            return "aa(name='$name')"
        }

    }
    
    fun call() {
        val aa = Aa("aa")
        println(aa)
    }
}

typealias Aa = AA.aa

fun main() {
    val aa = AA()
    aa.call()
}



