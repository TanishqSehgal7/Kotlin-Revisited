fun main() {

    val x: Int = 25
    val y: Int = 15
    val result: Int = x + y

    val result2: Int = Math.abs(x - y)

    val result3: Int = x*y

    val result4: Int = x/y

    println("Sum of $x and $y is: $result")

    println("Difference of $x and $y is: $result2")

    println("Product of $x and $y is: $result3")

    println("Division of $x and $y is: $result4")

    println("Remainder of $x % $y is: ${x % y}") // String interpolation

    // float takes 4 bytes
    val z: Float = 20F
    val w: Float = 10F
    println("Product of Floating numbers $z and $w is: ${z * w}")

    // double takes 8 bytes
    val t: Double = 20.1331234
    val s: Double = 10.1324
    println("Product of Double numbers $t and $s is: ${t * s}")

    val r : Double = 5.545
    val pi: Double = 3.14159265
    println("Volume of a sphere of radius $r is: ${(4/3) * pi * Math.pow(r, 3.0)}")

}