package learn

fun main() {
    val lst = mutableListOf("a", "b", "c", "d")

//    обычный цикл for
    for (l in lst) {
        println(l)
    }

//начать перебор со второго элемента
    for (l in 1 until lst.size) {
        println(lst[l])
    }

//начать с конца и идти через одного
    for (l in lst.size - 1 downTo 0 step 2) {
        println(lst[l])
    }

//    коллекции поддерживают foreach с лямбда-выражением
    lst.forEach{l -> println(l)}

//если нужны индексы
    lst.forEachIndexed({l, i -> println("по индексу $l значение $i")})


//обычный простейший цикл
    var count = 0
    while (count < 3) {
        println(count++)
    }

//    прерывание цикла с помощью break
    var count1 = 0
    while (true) {
        if (count1 == 3) {
            break
        }
        count1++
    }

}