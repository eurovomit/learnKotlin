package learn

class Player {
    val name = "gregor"
        get() = field.replaceFirstChar { it.uppercase() }   //    вызывается автоматически при обращении к полю
    var age = 39
        get() = field - 1       //    вызывается автоматически при обращении к полю, видимость такая же как у поля, менять ее смысла нет
        public set(value) {field = value + 1}   //    вызывается автоматически при обращении к полю, видимость методов не может быть шире видимости поля
    var rank = "assassin"
        private set                             //        сокращенная запись, если просто нельзя изменить вне класса
    val fullData: String                //    вычисляемое свойство
        get() = when {
            age < 18 -> "junge"
            age < 50 -> "fifge"
            else -> "old"
        }

    fun sayHello() {
        println("Функция say Hello")
    }
}

fun main() {
    val player = Player()
    player.sayHello()
    println(player.name)
    player.age = 55
    println(player.age)
    println(player.fullData)

}




