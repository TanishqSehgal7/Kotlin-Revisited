package ClassesInKotlin

abstract class Shape(
    var name:String) {

    /* name is protected which means that name is accessible
    to class Shape and all the class which inherit from the Shape class */

    init {
        println("I am the super class!")
    }

//    protected fun changeName(newName:String) {
//        name = newName
//    }

    /*
    If changeName function is made protected, then it can be accessed
    by the subclasses of Shape class in different or same package
    but not by any other class
    */

    fun changeName(newName:String) {
        name = newName
    }

    abstract fun areaOfShape():Double
    abstract fun perimeterOfShape(): Double
}

/*
Open class is a class which can be a parent class for other classes
ie, other classes can inherit from the class which is declared as open

if we declare a class as abstract, this means that other classes must only
inherit from the abstract class and its instances are not needed,
its child classes would inherit from the abstract class then
use its properties and methods with their instances

also abstract class would contain the methods which do not have an
implementation as of now and that implementation can change according
to the classes which inherit from the abstract class
abstract methods will not have a function body

abstract methods will have to be implemented in all the classes which
inherit the abstract class that contain abstract methods

an abstract class can have both normal functions and abstract functions
but a non-abstract class cannot have abstract functions
*/

