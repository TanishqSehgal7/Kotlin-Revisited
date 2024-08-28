import ClassesInKotlin.Circle
import ClassesInKotlin.Rectangle
import ClassesInKotlin.Triangle

fun main() {

    val rect : Rectangle = Rectangle(5.0,3.0)

    println("Area of rectangle is: ${rect.calculateArea()}")

    println("Perimeter of rectable is: ${rect.calculatePerimeter()}")

    val isSquare =  rect.isSquare()

    if (isSquare)
        println("This rectagle is actually a square")
    else
        println("This rectangle is not a square")

    val circle = Circle(5.0)

    println("Area of the circle is: ${circle.calculateArea()}")
    println("Circumference of the circle is: ${circle.calculateCircumference()}")

    val triangle = Triangle(8.0, 6.0,4.0)

    println("Perimeter of Triangle is : ${triangle.perimeterOfTriangle()}")

    println("Area of Triangle is: ${triangle.areaOfTriangle()}")

    val myCircle = Circle(5.0)
    myCircle.changeName("NewCircle")
    println("The name of the circle is: ${myCircle.name}")
    /*
        In the above example, since circle class inherits Shape class, whenever
        the object of myCircle is created, first the init block of Shape class
        is executed since on inheriting the Shape class its constructor is
        called
    */

    val myTriangle = Triangle(2.0, 3.0, 5.0)
    myTriangle.changeName("NewTriangle")
    println("The name of the triangle is: ${myTriangle.name}")

}

/*
Every object in kotlin inherits from the type "Any" that the Any class
has 3 functions equals(other:Any?):Boolean, hashCode():Int and
toString():String

Similarly, the Shape class inherits from the class Any
* */