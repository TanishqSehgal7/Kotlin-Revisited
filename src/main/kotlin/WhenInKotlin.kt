fun main() {

    val age = readLine()?.toInt()
    val x = 6

    /* when expression is only dependent on a single variable unlike if
    conditions */

    when(age) {
        in 0..5 -> println("You are a yound kid")
        in 6..17 -> println("You are a teenager")
        18 -> {
            /*
                Code needs to be included inside {} if more
                than once statement needs to be written
                for a specific case in when
            */
            println("Finally you are 18")
            if(x == 5)
                println("Let's get you a driver's license")
            else
                println("Your driver's license is already made")
        }
        in 19..25 -> println("You are a young adult")
        in 25..65 -> println("You are an adult")
        else -> println("You are really old!!")
    }

    
}