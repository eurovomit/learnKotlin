package learn

fun main() {
    var a: Int = -1

//    бросить исключение
//    if (a < 0) {
//        throw IllegalArgumentException("Negative number")
//    }

//    обработка исключения
    try {
        throw IllegalArgumentException("ошибка")
    } catch (e: Exception) {
        println(e.message)
    }

//    проверка предусловия
//    если условие не выполняется, то ошибка IllegalArgumentException с сообщением из фигурных скобок
//    require(a > 0) {
//        "функция require"
//    }

}

//определение собственного класса исключения
class Eurobich(): IllegalArgumentException("Собственная ошибка")