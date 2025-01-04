package learn

fun main() {

//    ==============СПИСКИ=============

//    создать список
    val lst1: List<String> = listOf("a", "b", "c")
    val lst2 = listOf("a", "b", "c")
    val lst3 = mutableListOf("a", "b", "c")
//    создать список с помощью конструктора, 1й элемент - размер, 2-й элемент - лямбда выражение
    val lst4 = List(3){index -> lst1[index].repeat(2)}

    println(lst4)

//    сделать список изменяемым и наоборот
    lst2.toMutableList()
    lst2.toList()


//обращение к элементам списка
    println(lst1[0])
    println(lst1.get(1))
    println(lst1.first())
    println(lst1.last())
    println(lst1.getOrElse(3){"нет такого индекса"})
    println(lst1.getOrNull(4))


//содержит ди список элементы
    println(lst1.contains("a"))
    println(lst1.containsAll(listOf("a", "b")))

//    изменить список можно только в mutableList
    lst3.add("d")                   // добавить
    lst3.add(0, "e")
    lst3.addAll(lst1)
    lst3 += "g"
    lst3[2] = "f"                   // изменить
    lst3.remove("d")        // удалить
    lst3 -= "g"
    lst3.removeAll(listOf("a", "b"))
    lst3.clear()

//деструктуризация списка
    val (a, b, c) = lst1
//    если нужна только одна переменная
    val (_, d, _) = lst1
    println(d)

//сделать значения в списке уникальными
    val lst5 = listOf("a", "a", "b", "c").distinct()
    println("уникальный список $lst5")



    //    ==============МНОЖЕСТВА=============
//    добавление и удаление аналогично спискам

    val set1 = setOf<String>("a", "b", "c", "c")

//проверка на наличие элемента в множестве
    println(set1.contains("a"))
    println("b" in set1)

//запрос второго элемента в множестве, но работает медленно, в этих случаях лучше использовать списки
    println(set1.elementAt(1))

//склеить множество и разделить запятыми
    println(set1.joinToString(","))

//случайное значение из множества
    println(set1.random())


    //    ==============СЛОВАРИ=============
    
//    создать словарь
    val dict1 = mapOf("a" to 1, "b" to 2, "c" to 3)
    val dict2 = mapOf(Pair("a", 1), Pair("b", 2), Pair("c", 3))
    val dict3 = mutableMapOf("a" to 1, "b" to 2, "c" to 3)

//    обратиться к значениям
    println(dict1["b"])                                                     // если нет ключа - вернет null
    println(dict1.getValue("a"))                                        // если нет ключа - вернет исключение
    println(dict1.getOrDefault("d", 0))                     // если нет ключа - вернет default

//    добавить значение
    dict3 += "d" to 4
    dict3 += mapOf("e" to 5, "f" to 6)

//    поменять значение по ключу или добавить значение
    dict3["f"] = 7
    dict3.put("f", 6)
    dict3.putAll(listOf("g" to 7, "h" to 8))
    dict3.getOrPut("k"){9} // если такого ключа нет - возвращается новое значение, если ключ есть - старое значение

//      удалить значения
    dict3.remove("k")
    dict3 -= listOf("a", "b")
    dict3.clear()


    //    пример преобразования списков в словарь попроще
    val lst7 = listOf("z", "y", "w")
    val lst8 = listOf(11, 12, 13)
    val dict5 = List(3){index -> lst7[index] to lst8[index]}.toMap()
    println(dict5)

//    пример преобразования списков в словарь посложнее
    val lst6 = listOf("a_1", "c_2", "e_3")
    val dict4: Map<String, Int> =
        List(3){index ->
                            val (z, y) = lst6[index].split("_")
                            z to y.toInt()}.toMap()
    println(dict4)


//    перебор элементов словаря
    val dict6 = mutableMapOf("a" to 1.087657654, "b" to 2.0765476546, "c" to 3.987676565476)
    dict6.forEach{(str, value) -> println("$str=${"%.2f".format(value)}")}
    dict6.forEach{ println("${it.key}=${it.value}") }


    //    ==============ПОСЛЕДОВАТЕЛЬНОСТИ=============

    val seq1 = generateSequence(0) { it + 1 }.takeWhile{it < 5}.toList()

}