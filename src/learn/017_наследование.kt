package learn


//чтобы наследоваться от класса, нужно ключевое слово open, также нужно сделать с методами
open class Room(val name: String) {
    protected open val status = "НЕЙТРАЛЬНЫЙ"

    fun description() = "$name $status"
    open fun enterRoom() {
        println("зашел в комнату")
    }
}


//нужно вызвать конструктор родительского класса
//в дочернем классе, если наследоваться уже от наследованного класса - все переопределенные функции доступны для переопределения
//чтобы это исправить - нужно ключевое слово final
class TownSquare: Room("Town Square") {
    override val status = "чистый"
    private var bellSound = "колокол"

    override fun enterRoom() {                          //переопределяемые методы со словом override
        println("зашел в городской сквер")
    }
    fun ringBell() {
        println("звук инструмента $bellSound")
    }
}




fun main() {

    var currentRoom: Room = TownSquare() //в таком вызове свои методы дочернего класса недоступны
    currentRoom.enterRoom()
    println(currentRoom.description())

    var testTownSquare = TownSquare()
    testTownSquare as Room
    println(testTownSquare.ringBell())




}