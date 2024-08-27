package ClassesInKotlin

class Circle(val radius:Double) : Shape("Circle") {

    val PI: Double = 3.15

    init {
        println("A circle is created with radius = $radius")
    }

    fun calculateArea() = PI * radius * radius

    fun calculateCircumference() = 2 * PI * radius
}