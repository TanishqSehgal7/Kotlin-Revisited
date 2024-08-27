package ClassesInKotlin

open class Shape(var name:String) {

    init {
        println("I am the super class!")
    }

    fun changeName(newName:String) {
        name = newName
    }
}

/*
Open class is a class which can be a parent class for other classes
ie, other classes can inherit from the class which is declared as open
*/