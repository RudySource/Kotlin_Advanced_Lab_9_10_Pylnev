package modules

import resources.OutpostResource
import resources.ResourceManager

class EnergyGenerator: OutpostModule("EnergyGenerator") {
    override fun performAction(manager: ResourceManager) : ModuleResult {
        println("EnergyGenerator working... Making 20 energy generation...")
        val energy = manager.get("Energy")

        return if (energy != null) {
            energy.amount += 20
            ModuleResult.ResourceProduced("Energy", 20)
        }else{
            manager.add(OutpostResource(99, "Energy", 20))
            ModuleResult.Success("Energy first created")
        }
    }
}