fun main() {

    print("Hello World!! \nThis is Kotlin revisit 2024")

    // val and var keyword in kotlin
    var myVariable : Int = 10

    val myVal: Int = 20

    print("\nvar is $myVariable \nval is: ${myVal}") // string interpolation

    myVariable = 20

    print("\nvar is re-assigned to: $myVariable")

//    myVal = 30 -> val cannot be re-assigned

    var myBoolean: kotlin.Boolean = true

    println("\nmyBoolean is: $myBoolean")

    myBoolean = false

    println("myBoolean is changed to: $myBoolean")
}