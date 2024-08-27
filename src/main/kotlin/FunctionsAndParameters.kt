fun main() {
    val x = 3
    myFunction()

    val base = 2
    val exp = 4
    println("$base to the power of $exp is ${parameterizedFunction(base,exp)}")

    val n = 10
    println("sum of first $n numbers is: ${sumOfNumbers(n)}")

    println(multiply(3,5))

    val list = mutableListOf(1,2,3,4,5)
    printListElements(list)
}

fun multiply(a:Int, b:Int) = a * b

fun printListElements(list:MutableList<Int>) {
    for (element in list) {
        print("$element ")
    }
}

fun sumOfNumbers(end:Int) : Int { // parameterized function with return value
    var result = 0
    for (i in 1..end) {
        result += i
    }
    return result
}

fun parameterizedFunction(base:Int, exp:Int) : Int {
    var result = 1;
    for (i in 1..exp) {
        result *= base
    }
    return result
}

fun myFunction() {
    println("First Line")
    println("Second Line")
    println("Third Line")
}