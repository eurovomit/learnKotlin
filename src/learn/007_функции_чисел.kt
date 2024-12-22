package learn

import kotlin.math.roundToInt

fun main() {

    val a = 460.25
    val b = 460
    val c = 16


    println((a / 100).toInt())              // приведение к типу Int
    println((a / 100).roundToInt())         // округление до ближайшего целого
    println(b.toDouble())                   // приведение к типу Double

    println(c.toString(radix = 2))          // перевод в двоичную систему
    println(c.toString(radix = 8))          // перевод в восьмеричную систему
    println(c.toString(radix = 16))         // перевод в шестнадцатиричную систему

    println(c.shl(2))               // сдвиг влево на разряда, равен умножению на 2 во второй степени
    println(c.shr(3))               // сдвиг вправо на разряда, равен делению на 2 в третьей степени
    println(c.xor(3))                 // исключающее или, для кодировки
    println(c.inv())                        // инверсия, для кодировки
    println(c.and(10))                // И, для кодировки
}