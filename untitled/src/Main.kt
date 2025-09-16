import kotlin.random.Random

class Human {
    var fullName: String
    var age: Int
    var currentSpeed: Double
    var x: Double
    var y: Double

    constructor(fullName: String, age: Int, currentSpeed: Double, x: Double, y: Double) {
        this.fullName = fullName
        this.age = age
        this.currentSpeed = currentSpeed
        this.x = x
        this.y = y
    }

    // Метод move()
    fun move() {
        // Создаём случайные изменения координат
        val dx = (Random.nextDouble() - 0.5) * currentSpeed
        val dy = (Random.nextDouble() - 0.5) * currentSpeed

        // Обновляем координаты
        this.x += dx
        this.y += dy

        // Выводим текущее положение
        println("$fullName is now at ($x, $y)")
    }
}