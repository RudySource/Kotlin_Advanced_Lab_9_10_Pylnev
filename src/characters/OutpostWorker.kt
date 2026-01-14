package characters

class OutpostWorker(val name: String) {
    var maxEnergy: Int = 100
        private set
    var energy: Int = maxEnergy
    set(value) {
        field = value.coerceIn(0, maxEnergy)
    }
    var mood: Int = 50
    get() = field + (energy / 10)
    var level: Int = 1
        private set

    fun work(){
        println("$name выполняет работу...")
        energy -= 15
        if (energy < 20) println("$name Устал!")
    }

    fun rest(){
        println("$name отдыхает...")
        energy += 20
    }

    fun levelUp(){
        level++
        maxEnergy += 20
        energy = maxEnergy
        println("$name Повысил уровень до $level! | MaxEngergy увл до: $maxEnergy")
    }

}
abstract class Human(val name: String){
    abstract var age: Int
    abstract fun hello()

}
class Person(name: String, override var age: Int)  : Human(name){
    override fun hello(){
        println("My name's $name!. My example.age is $age")
    }
}

abstract class Figure {
    abstract fun perimeter(): Double
    abstract fun area(): Double
}
class Rectangle(val width: Double, val height: Double): Figure() {
    override fun perimeter(): Double{
        return 2* (width * height)
    }
    override fun area(): Double {
        return width * height
    }
}
fun main() {
   /* val worker = characters.OutpostWorker("Алексей")
    println("Энергия: ${worker.energy}")
    println("Настроение: ${worker.mood}")
    worker.work()
    worker.work()
    worker.work()
    println("Энергия: ${worker.energy}")
    println("Настроение: ${worker.mood}")
    worker.rest()
    worker.energy = 150
//    worker.level = 5
    worker.levelUp()*/
    val denis: Person = Person("Denis", 2)
//    val pavel: characters.Human = characters.Human("Pavel")
    val maksim: Human = Person("Maksim", 3)
    denis.hello()
    maksim.hello()
}

