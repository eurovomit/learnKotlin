package learn

const val COMPILE: Int = 8 // константа времени компиляции

fun main() {
    // изменяемая переменная
    var playerLevel: Int = 2
    println(playerLevel)
    playerLevel++
    println(playerLevel)

    //    неизменяемая переменная
    val playerName: String = "Vika"
    println(playerName)

    // автоматическре определение типов
    val int = 5
    val string = "String"

}