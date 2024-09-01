package ClassesInKotlin.Generics

import kotlin.reflect.typeOf

// making custom Triple class
class CustomTriple<A:Any, B:Any, C:Any>(first:A, second:B, third:C) {

    init {
        println("Printing Types:\n")
        println("First is of type: ${first::class}") // !! makes any entity non nullable
        println("Second is of type: ${second::class}")
        println("Third is of type: ${third::class}")

    // or we can specify the type of A,B,C as Any so that it can take any kind of values
        // Any? specifies that we can also have nullable types
        // But Any restricts nullable types an accepts only non nullable values


    }

}