package ClassesInKotlin

open class Shape(
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
}

/*
Open class is a class which can be a parent class for other classes
ie, other classes can inherit from the class which is declared as open
*/

