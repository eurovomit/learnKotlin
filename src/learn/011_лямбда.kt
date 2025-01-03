package learn

import kotlin.random.Random

fun main() {

    //    простое лямбда-выражение, возвращает строку, чтоб получить эту строку, надо вызвать эту функцию
    //    лямбда выражение по умолчанию возвращает последнюю строку
    val a: () -> String = {
        val b = 3
        "test".repeat(b)
    }
    println(a())

//    простое лямбда выражение с параметром
    val b: (String) -> String = {
        message ->
        val b = message.length
        "test".repeat(b)
    }
    println(b("test"))


//    если входной параметр один, то его можно не указывать, а использовать слово it
    val c: (String) -> String = {
        val b = it.length
        "test".repeat(b)
    }
    println(c("test"))


    //    простое лямбда выражение с двумя параметрами
    val d: (String, String) -> String = {
            message, rep ->
        val b = message.length
        rep.repeat(b)
    }
    println(d("re", "one"))


//    можно в переменной не определять типы, но тогда их обязательно нужно задать в лямбде
    val f = { message: String, rep: String ->
        val b = message.length
        rep.repeat(b)
    }
    println(f("re", "two"))


//    можно переменной задать разные варианты лямбда-выражений
    val g: (String, String) -> String
    when (Random.nextInt(3)) {
        1 -> g = {one, two -> "$one $two"}
        else -> g = {one, two -> "$two $one"}
    }
    println(g("a", "b"))

}