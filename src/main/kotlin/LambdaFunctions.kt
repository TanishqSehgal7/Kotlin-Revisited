import ClassesInKotlin.Circle
import ClassesInKotlin.Rectangle
import ClassesInKotlin.Shape
import ClassesInKotlin.Triangle

fun main() {

// Lambda functions are used to pass functions as parameters to other functions
    var list = (1..20).toList()
    println(list)
    list = list.filter { it % 2 == 0 }
    println(list)

    val circle1 = Circle(5.0)
    val circle2 = Circle(4.0)
    val triangle1 = Triangle(4.0,3.0,2.0)
    val triangle2 = Triangle(3.0, 3.0,3.0)
    val rectangle1 = Rectangle(5.0)
    val rectangle2 = Rectangle(5.0,3.0)

    var shapes = mutableListOf<Shape>(circle1,circle2, triangle1, triangle2,
    rectangle1,rectangle2)

    shapes = shapes.filter { it.areaOfShape() > 20.0 }.sortedBy {
        it.areaOfShape()
    }.toMutableList()

    for (shape in shapes) {
        println("Area of ${shape.name} is ${shape.areaOfShape()}")
    }

    var newShapes = mutableListOf<Shape>(circle1,circle2, triangle1, triangle2,
        rectangle1,rectangle2)

    newShapes = newShapes.customFilterForShapes { it.areaOfShape() > 20 }
    println("New Shape list made using custom lambda function")
    for (shape in newShapes) {
        println(shape.areaOfShape())
    }

    var newShapes2 = mutableListOf<Shape>(circle1,circle2, triangle1, triangle2,
        rectangle1,rectangle2)

    newShapes2 = newShapes2.customFilterForShapesWithMoreThanOneArguments {
        shape, name -> shape.areaOfShape()>20
    }.toMutableList()

    println("\n")
    println("New Shape 2 list made using custom lambda function")
    for (shape in newShapes2) {
        println(shape.areaOfShape())
    }
}

// creating custom lambda functions
// for creating a custom lambda function, we will have to make it as an extension function

//  [ --------- Extension Function Name -----] [ -- arguments needed--] [return type]
fun MutableList<Shape>.customFilterForShapes(filterFunction: (Shape) -> (Boolean)) : MutableList<Shape> {

    var resultList = mutableListOf<Shape>()
    for (shape in this) {
        if (filterFunction(shape)) {
           resultList.add(shape)
        }
    }
    resultList = resultList.sortedBy { it.areaOfShape() }.toMutableList()
    return resultList
}

// custom lambda function with multiple arguments
fun MutableList<Shape>.customFilterForShapesWithMoreThanOneArguments(filterFunction: (Shape, String) -> (Boolean)) : MutableList<Shape> {

    var resultList = mutableListOf<Shape>()
    for (shape in this) {
        if (filterFunction(shape,shape.name)) {
            resultList.add(shape)
        }
    }
    resultList = resultList.sortedBy { it.areaOfShape() }.toMutableList()
    return resultList


}