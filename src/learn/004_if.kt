package learn

fun main() {
    val x = 3
    val y = true
    if (x == 3 && !y) {
        println("Yes")
    } else if (x == 2 || y) {
        println("No")
    } else {
        println("Yes")
    }

    val a = if (x == 3) true else false
    println(a)

    val b = if (x == 2) {41 + 6} else {55- 3}
    println(b)

    val c = if (x in 1..4) true else false
}