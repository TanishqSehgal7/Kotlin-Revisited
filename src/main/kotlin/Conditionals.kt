fun main() {

    val x = 7.0
    val y = 7.0
    val z = if(x+y == 14.0) 3.0 else 4.0

    if(x < y || (Math.pow(y,2.0) == 49.0)) {
        println("Atleast one condition is true")
    } else if(x > y) {
        println("x is greater than y")
    } else {
        println("x is equal to y")
    }
    println("Value of z is $z")

}