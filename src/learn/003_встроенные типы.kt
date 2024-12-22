package learn

import java.text.NumberFormat

fun main() {
    val s: String = "строка"
    val c: Char = 'c' // символ
    val b: Boolean = true
    val i: Int = 1 // целочисленный
    val ui: UInt = 1u // целочисленный положительный

//    ================ ДРОБНЫЕ ТИПЫ ================
    val d: Double = 1.0
    val float: Float = 1.0f

//    форматирование результата
    val balance: Double = 1200.40
    println("%.2f".format(balance)) // два знака после запятой      1200,40
    println("$%,.2f".format(balance)) // два знака после запятой    $1 200,40


    val byte: Byte = 1
    val ubyte: UByte = 1u
    val long: Long = 1L
    val ulong: ULong = 1u
    val short: Short = 1
    val ushort: UShort = 1u
    val l: List<Int> = listOf(1, 2, 3) // список
    val set: Set<Int> = setOf(1, 2, 3) // множество
    val map: Map<String, Int> = mapOf("one" to 1, "two" to 2, "three" to 3) // ассоциативный массив
    val pin = Double.POSITIVE_INFINITY // положительная бесконечность, например при делении на ноль
    val nin = Double.NEGATIVE_INFINITY // отрицательная бесконечность, например при делении на ноль
    val nan = Double.NaN // не число, например при извлечении корня из отрицательного числа
    fun un(): Unit {println("un")} // тип Unit - это тип невозвращаемого значения функции
}