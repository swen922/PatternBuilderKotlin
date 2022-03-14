package builder

import products.Engine

interface Builder {
    fun reset()
    fun setSeats(seats : Int)
    fun setEngine(engine : Engine)
    fun setDoors(doors : Int)
    fun setTripComputer(inst : Boolean)
    fun setGPS(inst : Boolean)
}