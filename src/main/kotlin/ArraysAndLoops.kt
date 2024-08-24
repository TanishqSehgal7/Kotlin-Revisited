import java.util.Arrays

fun main() {

    val myArray = arrayOf(1,2,3,4,5,6,7,8,9,10)
    val heros = arrayOf("Superman", "Batman", "Spiderman", "Captain America", "Iron man")

    for (element in myArray) {
        print("$element ")
    }

    println()

    for (hero in heros) {
        print("$hero ")
    }

    println()

    var i = 0
    while(i < myArray.size) {
        if(myArray.get(i++) % 2 == 0) {
            print("$i ")
        }
    }

    println()

    // array using user input
    val myArr = IntArray(10)
    var j = 0
    while (j < myArr.size) {
        val element = readLine()
        myArr[j++] = element?.toInt()!! // non null assertion
    }

    j = 0
    while(j < myArr.size) {
        println(myArr[j++])
    }

    val stringArr = Array(5) { "" }

    j = 0
    while (j < stringArr.size) {
        val element = readLine()
        stringArr[j++] = element!! // non null assertion
    }

    j = 0
    while(j < stringArr.size) {
        println(stringArr[j++])
    }

    
}