package learn

fun main() {
//    вопросительный знак с типом допуска NULL
    var s: String? = "Hello"
    s = null

//    вызвать метод не получится, если переменная допускает NULL
//    можно проверить через if
    var s1: String? = "Hello"
    if (s1 != null) {
        s1 = s1.replace("H", "B")
        println(s1)
    }
//    можно сделать безопасный вызов функции через ?., если переменная равна null, то она просто не будет вызвана
    var s2: String? = "Hello"
    s2 = null
    s2 = s2?.replace("H", "B")
    println(s2)
//    можно использовать функцию let с безопасным вызовом
    var s3: String? = "Hello"
//    s3 = null
    s3 = s3?.replace("H", "B")?.let {
        c -> c.replace("l", "k")
    }
    println(s3)
//    можно задать резервное значение для переменной, если она равна NULL, с помощью оператора ?:
    var s4: String? = "Hello"
    s4 = null
    s4 = s4?.replace("H", "B")?.let{
            c -> c.replace("l", "k")
    } ?: "сработала функция ?:"
    println(s4)
//    можно заставить вызвать метод с помощью !!
    var s5: String? = "Hello"
    s5 = s5!!.replace("H", "B")
}
