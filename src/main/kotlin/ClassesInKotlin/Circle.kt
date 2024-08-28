package ClassesInKotlin

class Circle constructor(val radius:Double) : Shape("Circle") {

//    the default visibility modifier in kotlin is public

    private val PI: Double = 3.15 // only accessible to Circle class since it is private
    init {
        println("A circle is created with radius = $radius")
    }

    fun calculateArea() = PI * radius * radius

    fun calculateCircumference() = 2 * PI * radius

}

/*

We can also make our constructor private in the following way
This means that we will only be able to instantiate objects of
circle class inside circle class only which would be a rare case
as far as real world usage is concerned

class Circle private constructor(val radius:Double): Shape("Circle") {

}
*/