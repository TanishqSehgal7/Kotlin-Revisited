import ClassesInKotlin.*
import java.lang.Exception

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

    val square = Rectangle(5,5)
    square.isSquare()

    println(maxArea(rect, myTriangle, myCircle))
    println(maxArea(myTriangle, square))

    println("Creating a random Circle")
    val newRandmomCircle = CompanionObjectsUsage.randomCircle()

    println("Creating a Random Reactangle")
    val newRandomRectangle = Rectangle.generateRandomRectangle()

    println("\n")

    println("Enter radius of Circle: \n")


    val newCircle = try {

        val circleRadius = try {
            readLine()?.toDouble()
        } catch (e:TypeCastException) {
            5.0
        }

        if (circleRadius != null)
            Circle(circleRadius)
        else
            5.0

    } catch (e:NegativeRadiusException) {
        Circle(5.0)
    }

}

/*
Every object in kotlin inherits from the type "Any" that the Any class
has 3 functions equals(other:Any?):Boolean, hashCode():Int and
toString():String

Similarly, the Shape class inherits from the class Any
*/

// function overloading - different number of parameters, different datatype of parameters

fun maxArea(shape1:Shape, shape2:Shape) : Double {
    val areaShape1 = shape1.areaOfShape()
    val areaShape2 = shape2.areaOfShape()
    return Math.max(areaShape1, areaShape2)
}

fun maxArea(shape1:Shape, shape2:Shape, shape3:Shape) : Double {
    val areaShape1 = shape1.areaOfShape()
    val areaShape2 = shape2.areaOfShape()
    val areShape3 = shape3.areaOfShape()
    return Math.max(areaShape1, Math.max(areaShape2,areShape3))
}

fun maxArea(shape1:Circle, shape2:Triangle, shape3:Rectangle) : Double {
    val areaShape1 = shape1.areaOfShape()
    val areaShape2 = shape2.areaOfShape()
    val areShape3 = shape3.areaOfShape()
    return Math.max(areaShape1, Math.max(areaShape2,areShape3))
}

