package example

var age: Int = 18
set(value) {
    if ((value > 0) and (value < 110))
        field = value
}

data class Item(val id: Int, val name: String, val quantity: Int){
    override fun toString(): String {
        return "example.Item (id=$id, name='$name', quantity=$quantity)"
    }
}

fun main(){
    /*
    println(example.age)
    example.age = 45
    println(example.age)
    example.age = -345
    println(example.age)


    println(sword.toString())
    println(betterSword.toString())
    */
    val sword = Item(1, "Sword", 1)
    val betterSword = sword.copy(quantity = 2)
    val(id, name, quantity) = betterSword
    println("id = $id, name = $name, quantity = $quantity")
}

