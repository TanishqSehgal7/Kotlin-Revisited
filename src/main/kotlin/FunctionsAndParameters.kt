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

    val arr = intArrayOf(10,20,550)
    println("Max is ${getMax(453,22,63,*arr,88,11,101,223)}")

    searchFor("How to be a good programmer?")
    searchFor("How to be a good programmer?", "Bing")
    // we can also mention parameters explicitly and passs their values in function
    // this concept is called as named parameters
    searchFor(srarchEngine = "Bing", search = "How to be a Kotlin programmer?")

    println(alternatingSum(453,22,63,*arr,88,11,101,223))
}

fun multiply(a:Int, b:Int) = a * b

fun printListElements(list:MutableList<Int>) {
    for (element in list) {
        print("$element ")
    }
    println()
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

// vararg lets us have variable number of arguments and is treated just like a list
fun getMax(vararg numbers: Int) : Int {

    var max = numbers[0]
    for (number in numbers) {
        if(number > max) {
            max = number
        }
    }
    return max
}

// default parameters
fun searchFor(search:String, srarchEngine:String = "Google") {
    println("Search for $search on search engine $srarchEngine")
}

fun alternatingSum(vararg numbers: Int) : Int {
    var sum = 0

    for(i in numbers.indices) {
        // arr.indices returns the valid indices for the array (0 to size-1)
        if(i%2 == 0)
            sum+=numbers[i]
        else
            sum-=numbers[i]
    }
    return sum
}