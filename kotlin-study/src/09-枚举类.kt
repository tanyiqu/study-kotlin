// 定义枚举类
enum class Direction {
    NORTH, SOUTH, WEST, EAST
}


// 初始化枚举类
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}


// 枚举常量还可以声明其带有相应方法 以及覆盖了基类方法的匿名类
enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },

    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocolState
}


fun main(args: Array<String>) {

}