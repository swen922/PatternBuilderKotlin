package products

class Car {
    private var seats : Int? = null
    private var engine : Engine? = null
    private var doors : Int? = null
    private var installTC : Boolean = false
    private var installGPS = false

    constructor() {
        println("created new Car!")
    }

    fun setSeats(s : Int) {
        this.seats = s
        println("car setSeats = $s")
    }

    fun setEngine(engine : Engine) {
        this.engine = engine
        println("car engyneType = ${engine.engineType()}")
    }

    fun setDoors(d : Int) {
        this.doors = d
        println("car doors = $doors")
    }

    fun installTC(b : Boolean) {
        this.installTC = b
        println("installed Trip Computer = $installTC")
    }

    fun installGPS(g : Boolean) {
        this.installGPS = g
        println("installed GPS = $installGPS")
    }

    fun drive() {
        println("go-go-go!\n")
    }
}

class Manual {
    private var seats : Int? = null
    private var engine : Engine? = null
    private var doors : Int? = null
    private var installTC : Boolean = false
    private var installGPS = false

    constructor() {
        println("created new Manual!")
    }

    fun setSeats(s : Int) {
        this.seats = s
        println("there is $seats seats in this car")
    }

    fun setEngine(engine : Engine) {
        this.engine = engine
        println("this car has ${engine.engineType()}")
    }

    fun setDoors(d : Int) {
        this.doors = d
        println("this car has $doors doors")
    }

    fun installTC(b : Boolean) {
        this.installTC = b
        var str : String = "This car has not Trip Computer"
        if (!installTC) {
            str = "this car has Trip Computer"
        }
        println(str)
    }

    fun installGPS(g : Boolean) {
        this.installGPS = g
        var str = "This car has not GPS"
        installGPS.let {
            if (it) str = "This car has GPS"
        }
        println(str)
    }

    fun read() {
        println("Shhh-hh-h-h-h-h-h\n")
    }
}