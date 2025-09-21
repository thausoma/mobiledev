import kotlin.random.Random


open class Human(val fullName: String, val age: Int, var currentSpeed: Double, var x: Double, var y: Double) {
    open fun move() {
        val dx = (Random.nextDouble() - 0.5) * currentSpeed
        val dy = (Random.nextDouble() - 0.5) * currentSpeed
        x += dx
        y += dy
        println("$fullName сейчас на (%.2f, %.2f)".format(x, y))
    }
}


class Driver(fullName: String, age: Int, currentSpeed: Double, x: Double, y: Double, val drivingExperience: Int) : Human(fullName, age, currentSpeed, x, y) {
    override fun move() {
        val dx = currentSpeed
        x += dx
        println("$fullName (drive) сейчас на (%.2f, %.2f)".format(x, y))
    }
}



fun main() {
    val humans = listOf(
        Human("Алексей", 30, 1.0, 0.0, 0.0),
        Human("Мария", 25, 1.2, 0.0, 0.0)
    )

    val driver = Driver("Сергей", 35, 2.5, 0.0, 0.0, 10)
    val allObjects = humans + driver
    val simulationTime = 10


    allObjects.forEach { obj ->
        Thread {
            for (timeStep in 1..simulationTime) {
                obj.move()
            }
        }.start()
    }
}