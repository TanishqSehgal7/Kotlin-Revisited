import java.util.*

fun main() {

    val name = "Tanishq"

    print("My name is ${name.uppercase()}")
    print("\nMy name is ${name.lowercase()}")

    val revName = name.reversed()
    println("\nReversed Name is: $revName")

    val strSubsequence = name.subSequence(0,4) // end index is not included
    println(strSubsequence)

    println(name.compareTo(name)) // compares 2 strings, return negative/positive in case of inequality

    println(name.replace('s','$'))
}