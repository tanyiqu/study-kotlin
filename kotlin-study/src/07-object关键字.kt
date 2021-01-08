// object 定义单例类
object Game {
    init {
        println("welcome !")
    }

    fun play() {
        println("play game")
    }
}

fun main(args: Array<String>) {
    Game.play()


    Game.play()
}