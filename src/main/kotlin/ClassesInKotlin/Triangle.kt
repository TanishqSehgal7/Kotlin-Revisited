package ClassesInKotlin

import kotlin.math.sqrt

class Triangle(
    val a:Double,
    val b:Double,
    val c:Double) : Shape("Triangle") {

    fun perimeterOfTriangle() = a + b + c

    private val perimeter = perimeterOfTriangle()

    fun areaOfTriangle() = sqrt(perimeter*(perimeter-a)*(perimeter-b)*(perimeter-c))

    override fun areaOfShape(): Double {
        return sqrt(perimeter*(perimeter-a)*(perimeter-b)*(perimeter-c))
    }

    override fun perimeterOfShape(): Double {
        return a + b + c
    }
}