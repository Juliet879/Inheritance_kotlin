fun main() {
    var car = Car("Mazda", "CX-30", "black", 5)
    car.carry(7)
    car.identity()
    car.calculateParkingFees(2)

    var bus = Bus("Toyota", "4X", "white", 60)
    bus.carry(43)
    bus.identity()
    bus.maxTripFare(70.00)
    bus.calculateParkingFees(4)


}

open class Vehicle(var make: String, var model: String, var color: String, var capacity: Int) {
    fun carry(people: Int) {
        var x = people - capacity
        if (people < capacity) {
            println("Carrying $people passangers")
        } else {
            println("Overcapacity by $x people")
        }
    }

    fun identity() {
        println("I am $color $make $model ")
    }

    open fun calculateParkingFees(hours: Int): Int {
        var fees = hours * 20
        return fees
    }
}

class Car(make: String, model: String, color: String, capacity: Int) : Vehicle(make, model, color, capacity) {

}

class Bus(make: String, model: String, color: String, capacity: Int) : Vehicle(make, model, color, capacity) {
    fun maxTripFare(fare: Double): Double {
        return fare * capacity
    }


    override fun calculateParkingFees(hours: Int): Int {
        return hours * capacity
    }

}