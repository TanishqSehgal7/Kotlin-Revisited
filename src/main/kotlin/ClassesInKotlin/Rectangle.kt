package ClassesInKotlin

class Rectangle(
    // this is the class constructor
    val a:Double, val b: Double) : Shape("Rectangle") {

    init {
        /* the init block contains the logic to be executed when an
            object of a particular class is created
        */
        println("Rectangle created with a = $a and b = $b")
    }

    fun calculateArea() = a * b

    fun calculatePerimeter() = 2*a + 2*b

    fun isSquare() = a == b

}