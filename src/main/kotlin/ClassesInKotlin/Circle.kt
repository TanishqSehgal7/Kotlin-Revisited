package ClassesInKotlin

class Circle constructor(val radius:Double) : Shape("Circle") {

    constructor(diameter : Int) : this((diameter/2).toDouble())

//    the default visibility modifier in kotlin is public

//    private val PI: Double = 3.15 // only accessible to Circle class since it is private
    init {
        println("A circle is created with radius = $radius")
        println("Area of the circle is: ${areaOfShape()}")
        println("Perimeter of the circle is: ${perimeterOfShape()}")
        ImportantConstants.myFunc()
    }

    fun calculateArea() = ImportantConstants.PI * radius * radius

    fun calculateCircumference() = 2 * ImportantConstants.PI * radius
    override fun areaOfShape(): Double {
        return ImportantConstants.PI * radius * radius
    }

    override fun perimeterOfShape(): Double {
        return ImportantConstants.PI * radius * radius
    }

}

/*

We can also make our constructor private in the following way
This means that we will only be able to instantiate objects of
circle class inside circle class only which would be a rare case
as far as real world usage is concerned

class Circle private constructor(val radius:Double): Shape("Circle") {

}
*/