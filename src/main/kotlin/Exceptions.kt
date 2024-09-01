import java.lang.Exception
import java.lang.NumberFormatException

fun main() {
    println("Please enter a number:\n")
    val input = try {
        readLine()?.toInt()
    } catch (e:NumberFormatException) {
        0 // assigning default value to input
    } finally {
        println("This is from the finally block")
    }
    println("Your input is: $input")

    println(divideTwoNumbers(10.0,5.0))
//    println(divideTwoNumbers(5.0,0.0))

    val divisionResult = try { // now on dividing by zero, program does not crash
        divideTwoNumbers(5.0,0.0)
    } catch (e:DivisionByZeroException) {
        0.0
    }

    println("Result of the division is: $divisionResult")
}

fun divideTwoNumbers(a:Double, b:Double) :  Double {
    if(b == 0.0)
        throw DivisionByZeroException()

    return a/b
}

// creating custom exceptions

class DivisionByZeroException : Exception("You cannot divide by 0! Please choose a different number")