package resources

class ResourceManager {
    private val resources = mutableListOf<OutpostResource>()

    fun add(resource: OutpostResource) {
        resources.add(resource)
        println("Добавлен ресурс: $resource")
    }

    fun get(name: String): OutpostResource? {
        return resources.find { it.name == name }
    }

    fun printAll(){
        println("Ресурсы Базы")
        resources.forEach { println("${it.name}: ${it.amount}") }
    }
}