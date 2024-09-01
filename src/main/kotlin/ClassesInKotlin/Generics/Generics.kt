package ClassesInKotlin.Generics

import ClassesInKotlin.Circle
import ClassesInKotlin.Rectangle
import ClassesInKotlin.Shape
import ClassesInKotlin.Triangle

fun main() {

    /*
    Generics are basically type parameters which can be passed as data types
    for a particular entity
    Generics allow us to write flexible and reusable code, create classes
    and interfaces and functions that work with different types while ensuring
    type safety.

    Generics in Kotlin are specified using type parameters. A type parameter
    is a placeholder for an actual type that will be provided when the generic
    type is used.

    Type parameters are defined inside angle brackets <>.
    When creating an instance of a generic class, you specify the type to be used.

        class Box<T>(val value: T)

        val intBox = Box(123)    // Box<Int>
        val stringBox = Box("Hello")  // Box<String>

        fun <T> printContent(content: T) {
            println(content)
        }

        printContent(123)        // Prints: 123
        printContent("Hello")    // Prints: Hello

        class Pair<K, V>(val key: K, val value: V)
        val pair = Pair(1, "One")  // Pair<Int, String>
    */

    var listOfInt = (1..20).toList()

    println("Filter applied on an integer list")
    listOfInt.filterNumbers { it % 2 == 0 }.sortedBy { it }.reversed().forEach {
        print("$it ")
    }

    println("\n")

    val circle1 = Circle(5.0)
    val circle2 = Circle(4.0)
    val triangle1 = Triangle(4.0,3.0,2.0)
    val triangle2 = Triangle(3.0, 3.0,3.0)
    val rectangle1 = Rectangle(5.0)
    val rectangle2 = Rectangle(5.0,3.0)

    var shapes = mutableListOf<Shape>(circle1,circle2, triangle1, triangle2,
        rectangle1,rectangle2)

    println("\nFilter applied on a list of shapes")

    /*
    Chaining in Kotlin refers to the practice of invoking multiple methods or
    operations sequentially on an object or result in a single statement.
    This is made possible by methods that return a reference to the same object
    (or another object), allowing the next method to be called directly.
    Chaining helps to write more concise, readable, and expressive code.
     */

    shapes.filterListValues { it.areaOfShape() > 20.0 }.sortedBy { it.areaOfShape() }.forEach {
        print("${it.areaOfShape()}, ")
    }

    // Generic classes for passing multiple parameters

    val triple = Triple<Int,String,Boolean>(3,"Tanishq", true)
    val pair = Pair<Int,String>(3,"Tanishq")

    println("\n Triple.first = ${triple.first}; Triple.second = ${triple.second}; Triple.third = ${triple.third}")
    println("Pair.first = ${pair.first}; Pair.second = ${pair.second}")

    println("\n")

    val customTriple = CustomTriple(2.0, "Tanishq", true)
}

// making a custom extension function using generics for filtering values

fun <T> List<T>.filterListValues(filterFunction: (T) -> (Boolean)) : List<T> {
    val resultList = mutableListOf<T>()
    for(item in this) {
        if(filterFunction(item))
            resultList.add(item)
    }
    return resultList
}

// custom filter with generics that can be only applied to Numbers in general
fun <T> List<T>.filterNumbers(filterFunction: (T) -> (Boolean)) : List<T> {
    val resultList = mutableListOf<T>()
    for(item in this) {
        if(filterFunction(item))
            resultList.add(item)
    }
    return resultList
}
