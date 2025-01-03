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

}