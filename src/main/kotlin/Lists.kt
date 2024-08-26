fun main() {

    val array = arrayOf(1,2,3) // values of an array can be changed during runtime
    val list = listOf<Int>(1,2,3) // values of a list cannot be changes during runtime
    // values of a list are immutable by default in kotlin

    array[0] = 3
    println(list)

    // we can create a mutable list as follows
    val mutableList = mutableListOf<Int>(1,2,3,4,5)
    mutableList.set(4,0)
    println(mutableList)
    mutableList[0] = 0
    println(mutableList)

    /* difference between mutablelist and array -> mutable list can change in size while
        arrays have fixed size throughout the scope of the program
    */

    mutableList.add(5,5)
    println(mutableList)

    mutableList.remove(5)
    println(mutableList)

    mutableList.removeAt(0)
    println(mutableList)

    // creation of an empty list
    val newList = mutableListOf<Int>()

    for(i in 1..10) {
        val input = readLine()
        if(input!=null)
            newList.add(input.toInt())
    }
    println(newList)

    // fibonacci series with mutable list
    val n = 10
    val fibonacciList = mutableListOf<Int>()
    fibonacciList.add(0)
    fibonacciList.add(1)
    for (i in 0 until n) {
        fibonacciList.add(fibonacciList.get(i) + fibonacciList.get(i+1))
    }
    println(fibonacciList)
}