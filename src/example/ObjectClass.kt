package example

object GameSession {
    init {
        println("Игровая сессия создана")
    }
    var isActive: Boolean = false
    fun start(){
        isActive = true
        println("Игра началась")
    }
    fun end(){
        isActive = false
        println("Игра завершена")
    }
}

fun main(){
    println("Программа запущена")
    println("Проверяем состояние, но не трогаем GameSession")
    println("Теперь запускаем игру")
    GameSession.start()
    println("Проверяем состояние ещё раз")
    println("Активна ли сессия: ${GameSession.isActive}")
}