fun main() {

    println("Please enter a number")

    val input = readLine()?.toInt()

    if(input!=null ) {
        if(input.isPrime())
            println("$input is a prime number")
        else
            println("$input is not a prime number")
    }

    val list = listOf<Int>(1,2,3,4,5,6)

    if(list!=null) {
        println("Product of elements of $list is ${list.printProductOfElements()}")
    }
}

/*
Kotlin provides the ability to extend a class or an interface with new functionality
without having to inherit from the class.

So if for any predefined class, if we need to have our own functionality and extend it defined it
in the extension function

this keyword gives the access the quantity to which the functionality is being extended
*/


fun Int.isPrime(): Boolean {
    for (i in 2 until this) {
        if(this % i == 0) {
            return false
        }
    }
    return true
}

fun List<Int>.printProductOfElements() : Int {

    var product = 1;

    for (element in this) {
        product *= element
    }
    return product
}

