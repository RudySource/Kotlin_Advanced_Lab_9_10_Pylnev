class ResearchLab: OutpostModule("Research Lab") {
    override fun performAction(manager: ResourceManager) {
        val minerals = manager.get("Minerals")
        if (minerals == null || minerals.amount < 30) {
            println("Minerals is required")
            return
        }else{
            minerals.amount -= 30
            println("Лаборатория проводит иследования (минералы - 30)")
        }
    }
}