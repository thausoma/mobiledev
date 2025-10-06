import kotlin.random.Random


class Human (
    private var fullName: String,
    private var age: Int,
    private var currentSpeed: Double,
    private var x: Double,
    private var y: Double
)
{
    fun move() {
        val dx = (Random.nextDouble() - 0.5) * currentSpeed
        val dy = (Random.nextDouble() - 0.5) * currentSpeed
        x += dx
        y += dy
        println("$fullName is now at (%.2f, %.2f)".format(x, y))
    }

    fun getAge(): Int {
        return age
    }

    fun getcurrentSpeed(): Double {
        return currentSpeed
    }

    fun getX(): Double {
        return x
    }

    fun getY(): Double {
        return y
    }

    fun setAge(number: Int) {
        this.age = number
    }

    fun setcurrentSpeed(number: Double) {
        this.currentSpeed = number
    }

    fun setX(number: Double) {
        this.x = number
    }

    fun setY(number: Double) {
        this.y = number
    }

    fun getFullName(): String {
        return fullName
    }
}

fun main() {
    val numberOfHumans = 5
    val humans = Array<Human>(numberOfHumans) { index ->
        val fullName = "Human ${index + 1}"
        val age = 20 + index
        val speed = 0.5 + index * 0.1
        val startX = 0.0
        val startY = 0.0

        Human(fullName, age, speed, startX, startY)
    }

    val simulationTime = 10
    for (timeStep in 1..simulationTime) {
        println("\n--- Time: $timeStep seconds ---")
        for (human in humans) {
            human.move()
        }
    }
}