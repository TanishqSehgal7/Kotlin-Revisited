package ClassesInKotlin

class Rectangle(
    // this is the primary constructor of the class
    val a:Double, val b: Double) : Shape("Rectangle") {

    // secondary constructor - there can be as many secondary constructors of a class
    constructor(a:Double) : this(a,a)
    constructor(a:Int, b:Int) : this(a.toDouble(), b.toDouble())

    init {
        /* the init block contains the logic to be executed when an
            object of a particular class is created
        */
        println("Rectangle created with a = $a and b = $b")
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