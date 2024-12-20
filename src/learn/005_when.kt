package learn

fun main() {
    val a = 3
    val z = 4
    val b = when (a) {
        0 -> "null"
        1 -> "one"
        in 2..4 -> if (a == 2) "two" else "three"
        else -> "other"
    }
    println(b)

    val c = when (val d = a * 3) {
        0 -> "null"
        1 -> "one"
        in 2..9 -> if (a == 2) "two" else "three"
        else -> "other"
    }
    println(c)

    val d = when {
        a > z -> {"a"}
        else -> "other"
    }
    println(d)
}