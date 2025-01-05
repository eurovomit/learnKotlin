package learn

//инициализация в следующем порядке:
//главный конструктор
//блок инициализации
//дополнительный конструктор

class Man (name: String,  val hometown: String = "KLD", var age: Int) {
    var name: String = name
        get() = field.replaceFirstChar { it.uppercase() }
        private set(value) { field = value.trim()}
    val fullData = "$name из города $hometown, возраст - $age"
    //    остальные поля можно не описывать, для них создаются методы доступа автоматически

//    блок инициализации
    init { require(age >= 18) { "несовершеннолетний"}}

//дополнительный конструктор, ключевое слово this вызывает главный конструктор
    constructor(name: String, hometown: String): this(name, hometown, 18) {
        if (hometown.equals("spb", ignoreCase = true)) age = 20
    }
}





fun main() {

//    можно вызывать с именованными параметрами или без них
    val man1 = Man(name = "Victor", hometown = "Moscow", age = 18)
    val man2 = Man("Gregor", "SPb")
    println(man2.age)
    println(man2.hometown)

}