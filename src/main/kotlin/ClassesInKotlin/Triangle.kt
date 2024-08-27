package ClassesInKotlin

class Triangle(val a:Double, val b:Double, val c:Double) {


    val h = Math.abs(Math.sqrt(Math.pow(a,2.0) - Math.pow(b/2,2.0)))

    fun areaOfTriangle() = 0.5 * b * h

    fun perimeterOfTriangle() = a + b + c
}