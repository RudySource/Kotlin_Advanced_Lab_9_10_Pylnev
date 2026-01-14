package example

interface Movable{
    var speed: Int
    val model: String
    val number: String
    fun move()
    fun stop(){
        println("Move is stop")
    }
}
class Car(override val model: String, override val number: String): Movable{
    override var speed = 60
    override fun move() {
        println("example.Car speed $speed")
    }
    override fun stop() = println("example.Car is stopping...")
}

class Aircraft(override val model: String, override val number: String): Movable{
    override var speed = 600
    override fun move() {
        println("Fly example.Aircraft speed $speed")
    }
    override fun stop() = println("Fly example.Aircraft is stopping...")
}

fun travel(obj: Movable) = obj.move()

interface Worker{
    fun work()
}
interface Student {
    fun study()
}

class WorkingStudent(val name: String): Worker, Student{
    override fun study() = println("$name is learning...")
    override fun work() = println("$name is working ...")
}

interface VideoPlayable{
    fun play() = println("Video playing...")
}

interface AudioPlayable{
    fun play() = println("Audio playing...")
}

class MediaPlayer: VideoPlayable, AudioPlayable{
    override fun play(){
        println("Start playing...")
        super<VideoPlayable>.play()
        super<AudioPlayable>.play()
    }
}
fun main() {
    /* val car = example.Car()
    val aircraft = example.Aircraft()
    example.travel(aircraft)
    example.travel(car)

    val car: example.Movable = example.Car()
    val aircraft: example.Movable = example.Aircraft()
    val pavel = example.WorkingStudent("Pavel")
    car.move()
    car.stop()
    aircraft.move()
    aircraft.stop()
     */
//    val car = example.Car("Lada", "123LAD")
//    val aircraft = example.Car("Boeing", "737")
//    car.move()

    val player = MediaPlayer()
    player.play()
}