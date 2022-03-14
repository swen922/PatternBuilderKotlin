package products

interface Engine {
    fun engineType() : EngineType
    fun maxForce() : Int
    fun work()
}