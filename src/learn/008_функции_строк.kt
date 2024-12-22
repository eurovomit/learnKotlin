package learn

fun main() {
    val name: String = "Имя"
    val lastname: String = "Фамилия"

    println("полное $name")
    println("полное ${name + " " + lastname}")
    println("\t\"табуляция\"")
    println("\b\"забой\"")
    println("\n\"перевод строки\"")
    println("\r\"возврат каретки\"")
    println("\u0410\"символ юникода\"")
    println("\$\"знак доллара\"")
    println("\\\"обратный слэш\"")
    println("\'\"одинарная кавычка\"")
    println("""
                        | точная копия строки
                        | со всеми кавычками и пробелами
    """)
    println("""
                        | точная копия строки
                            | со всеми кавычками и пробелами
                            | но начинается каждая строка с прямой черты
    """.trimMargin())
    println("""
                точная копия строки
                         со всеми кавычками и пробелами
                         убирает пробелы по самой левой строке
    """.trimIndent())

//    println(readLine())         // читает ввод

//    приведение к числам
    println("54".toInt())
    println("54".toFloat())

    // регулярное выражение для проверки ввода строки из цифр
//    var inp = readLine()!!
//    val total = if (inp.matches("""\d+""".toRegex())) {inp.toInt()} else 0
//    println(total)

//    замена подстроки
    val test = "moloko"
    println(test.replace("o", "OO"))

//    сравнение строк
    println("O".replace("O", "o") == "O".replace("O", "o"))
//    сравнение ссылок
    println("O".replace("O", "o") === "O".replace("O", "o"))
}