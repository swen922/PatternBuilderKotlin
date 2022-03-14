package builder
import products.*

class CarBuilder : Builder {

    private var car : Car

    constructor() {
        this.car = Car()
    }

    override fun reset() {
        this.car = Car()
    }

    override fun setSeats(q : Int) {
        this.car!!.setSeats(q)
    }

    override fun setEngine(engine: Engine) {
        this.car!!.setEngine(engine)
    }

    override fun setDoors(doors: Int) {
        this.car!!.setDoors(doors)
    }

    override fun setTripComputer(inst: Boolean) {
        this.car!!.installTC(inst)
    }

    override fun setGPS(inst: Boolean) {
        this.car!!.installGPS(inst)
    }

    fun getResult() : Car {
        return this.car
    }
}

class ManualBuilder : Builder {

    private var manual : Manual

    constructor() {
        this.manual = Manual()
    }

    override fun reset() {
        this.manual = Manual()
    }

    override fun setSeats(seats: Int) {
        this.manual?.setSeats(seats)
    }

    override fun setEngine(engine: Engine) {
        this.manual?.setEngine(engine)
    }

    override fun setDoors(doors: Int) {
        this.manual?.setDoors(doors)
    }

    override fun setTripComputer(inst: Boolean) {
        this.manual?.installTC(inst)
    }

    override fun setGPS(inst: Boolean) {
        this.manual?.installGPS(inst)
    }

    fun getResult() : Manual {
        return this.manual
    }
}