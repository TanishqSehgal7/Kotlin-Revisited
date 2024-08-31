package ClassesInKotlin

import kotlin.random.Random

class CompanionObjectsUsage constructor(val radius:Double) {

/*
companion objects are used in case when we want to have the functionality
of a class and a singleton within a same entity
It allows you to define members that can be accessed in a static-like manner
while simultaneously being associated with a class

A companion object is initialized when a class is loaded making is a
convenient place to put logic that needs to be executed once when the class
is first used
*/

    companion object {
        fun randomCircle() : Circle {
            val radius = Random.nextDouble(1.0,10.0)
            return Circle(radius)
        }
    }

}