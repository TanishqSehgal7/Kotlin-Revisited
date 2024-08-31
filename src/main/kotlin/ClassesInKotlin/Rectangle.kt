package ClassesInKotlin

import kotlin.random.Random

class Rectangle(
    // this is the primary constructor of the class
    val a:Double, val b: Double) : Shape("Rectangle") {

    // secondary constructor - there can be as many secondary constructors of a class
    constructor(a:Double) : this(a,a)
    constructor(a:Int, b:Int) : this(a.toDouble(), b.toDouble())

    companion object {
        fun generateRandomRectangle() : Rectangle {
            val l = Random.nextDouble(5.0,10.0)
            val b = Random.nextDouble(5.0,10.0)
            return Rectangle(l,b)
        }
    }

    init {
        /* the init block contains the logic to be executed when an
            object of a particular class is created
            We can have multiple init blocks, and they will be
            executed in the order they appear
        */
        println("Rectangle created with a = $a and b = $b")
        ImportantConstants.myFunc()
    }

    fun calculateArea() = a * b

    fun calculatePerimeter() = 2*a + 2*b

    fun isSquare() = a == b
    override fun areaOfShape(): Double {
        return a * b
    }

    override fun perimeterOfShape(): Double {
        return 2*a + 2*b
    }

}