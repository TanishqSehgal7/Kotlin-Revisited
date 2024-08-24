fun main() {

    val x = 4
    val y = 5

    println(x > y)
    println(x == y)
    println(x < y)
    println(x != y)
    println(x <= y)
    println(x >= y)

    val a = 6
    val b = 10

    println(a >= x && b >= y)
    println(a >= x || b <= y)
    println(!(a >= x) && b <= y)
    println(!(a >= x) || b <= y)

    val simpleExp = 3 > 4 || 4 > 3 &&  4 <= 4
    println("\n" + simpleExp)

    val bool = true
    val t = 9
    val u = 3
    val v = 9
    val hardExp = !(t != v) && bool || v > (t + u) && (!bool || u < v) // gives true
    /*
    (!bool || u < v) -> false || true -> true
    v > (t + u) -> false
    => false && true = false

    !(t != v) && bool -> false && true = true

        !(t != v) && bool || v > (t + u) && (!bool || u < v) = true
            true         ||           false                  = true
    */
    println(hardExp)
}