package learn

fun main() {

//    функции преобразователи
    val list1 = listOf(1, 2, 3)
    val list2: List<Int> = list1.map { y: Int -> val x = y * y
        x}
    println(list2)
    val list3: List<Int> = list1.map { it * it }
    println(list3)

//    функции фильтрации
    val lst4: List<Int> = list1.filter { it > 1 }
    println(lst4)

//    функции комбинирования
    val lst5 = listOf(1, 2, 3)
    val lst6 = listOf(3, 2, 1)
    val lst7 = lst5.zip(lst6) { a, b -> a + b }
    println(lst7)

//    функции агрегации
    val tot = lst6.reduce{x, y -> x + y}
    println(tot)
    val tot1 = lst6.fold(10) {x, y -> x + y}
    println(tot1)
}