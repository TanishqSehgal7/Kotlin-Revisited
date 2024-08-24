fun main() {

    val x = 7.0
    val y = 7.0
    val z = if(x+y == 14.0) 3.0 else 4.0

    if(x < y || (Math.pow(y,2.0) == 49.0)) {
        println("Atleast one condition is true")
    } else if(x > y) {
        println("x is greater than y")
    } else {
        println("x is equal to y")
    }
    println("Value of z is $z")

    val userInput = readLine() // taking user input in kotlin
    println("You entered $userInput")

    println(userInput?.uppercase()) // ? checks if userInput is null or not

    if (userInput!=null)
        println(userInput.toInt() - 5)

    val age = readLine()

    if (age != null) {
        if(age < 18.toString()) {
            println("You're not an adult yet!")
        } else if (age > 18.toString() && age<=65.toString()) {
            println("You're an adult")
        } else {
            println("You're really really old!")
        }
    }

    // check if string is palindrome
    val str = "racecar"
    if (isPalindrome(str)) {
        println("$str is a Palindromic String")
    } else {
        println("$str is not a Palindromic String")
    }
}

fun isPalindrome(str:String) : Boolean {

    var start = 0
    var end = str.length-1
    var isPalindrome = false;

    while (start!=end) {
        if(str.get(start) == str.get(end)) {
            start++;
            end --;
            isPalindrome = true
        } else {
            isPalindrome = false
        }
    }

    return isPalindrome
}