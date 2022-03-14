import builder.*
import products.*

class Director {
    fun buildSportCar(builder : Builder) {
        builder.reset()
        builder.setSeats(2)
        builder.setEngine(GasEngine())
        builder.setDoors(2)
        builder.setTripComputer(true)
        builder.setGPS(false)
    }
    fun buildOutdoorCar(builder : Builder) {
        builder.reset()
        builder.setSeats(6)
        builder.setEngine(DieselEngine())
        builder.setDoors(5)
        builder.setTripComputer(true)
        builder.setGPS(true)
    }
    fun buildGoofCar(builder : Builder) {
        builder.reset()
        builder.setSeats(3)
        builder.setEngine(ElectricEngine())
        builder.setDoors(3)
        builder.setTripComputer(false)
        builder.setGPS(false)
    }
}


/** Строитель, также известен как: Builder */

fun main(args : Array<String>) {
    val dir = Director()
    val cb = CarBuilder()
    val mn = ManualBuilder()


    dir.buildSportCar(cb)
    val sportCar = cb.getResult()
    sportCar.drive()

    dir.buildSportCar(mn)
    val sportManual = mn.getResult()
    sportManual.read()


    dir.buildOutdoorCar(cb)
    val outdoorCar = cb.getResult()
    outdoorCar.drive()

    dir.buildOutdoorCar(mn)
    val outManual = mn.getResult()
    outManual.read()


    dir.buildGoofCar(cb)
    val goofCar = cb.getResult()
    goofCar.drive()

    dir.buildGoofCar(mn)
    val goofManual = mn.getResult()
    goofManual.read()


}
