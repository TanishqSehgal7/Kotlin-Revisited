package ClassesInKotlin

class AnonymousClasses {

/*

anonymous classes are classes that are not explicitly declared and are
used for creating objects of a class that only needs to be instantiated once,
usually for implementing interfaces or abstract classes.
These classes are defined using an object expression.

*/



}

fun main() {

    println("Creating a Parallelogram")
    val a = 3.0
    val b = 4.0
    val ht = 2.0

    // we can create anonymous classes in the following way
    val parallelogram = object : Shape("Parallelogram", a, b, ht) {

        // we can also have an init block for our anonymous classes as well

        init {
            println("Parallelogram created with dimensions a=${a}, b=${b} and height=${ht}")
            println("Area of parallelogram is: ${this.areaOfShape()}")
            println("Area of parallelogram is: ${this.perimeterOfShape()}")
            if (this.isRectangle()) println("This parallelogram is a rectangle")
            else println("This parallelogram is not a reactangle")
        }


        override fun areaOfShape(): Double {
            return b * ht
        }

        override fun perimeterOfShape(): Double {
            return (2*a + 2*b)
        }

        fun isRectangle() : Boolean = ht == a

    }

    println("Creating a Trapezium")
    val a1 = 9.0
    val b1 = 23.0
    val c1 = 13.0
    val d1 = 11.0

    val trapezium = object : Shape("Trapezium", a1, b1, c1, d1, ht) {

        init {
            println("Parallelogram created with dimensions a=${a}, b=${b} and height=${ht}")
            println("Area of parallelogram is: ${this.areaOfShape()}")
            println("Area of parallelogram is: ${this.perimeterOfShape()}")

            if(isRectangle())
                println("This trapezium is a rectangle")
            else
                println("This trapezium is not a rectangle")
        }

        override fun areaOfShape(): Double {
            return 0.5 * (a+b) * ht
        }

        override fun perimeterOfShape(): Double {
            return a + b + c1 + d1
        }

        fun isRectangle(): Boolean = a1 == c1 && b1 == d1

    }

//    println("Area of parallelogram is: ${parallelogram.areaOfShape()}")
//    println("Perimeter of parallelogram is: ${parallelogram.perimeterOfShape()}")
}