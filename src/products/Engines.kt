package products

class DieselEngine : Engine {

    override fun engineType(): EngineType {
        return EngineType.DIESEL
    }

    override fun maxForce(): Int {
        return 350
    }

    override fun work() {
        println("GR-GR-GR-GR-GR-GR-GR! Diesel Engine")
    }
}

class ElectricEngine : Engine {
    override fun engineType(): EngineType {
        return EngineType.ELECTRIC
    }

    override fun maxForce(): Int {
        return 120
    }

    override fun work() {
        println("PS-S-S-S-S-S-S-S! Electric Engine")
    }
}

class GasEngine : Engine {
    override fun engineType(): EngineType {
        return EngineType.GAS
    }

    override fun maxForce(): Int {
        return 240
    }

    override fun work() {
        println("R-R-R-R-R-R-R! Gas Engine")
    }
}