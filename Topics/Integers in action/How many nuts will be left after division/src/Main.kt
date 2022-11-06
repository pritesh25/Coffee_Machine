import java.util.Scanner

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    //println("enter number of squirrels ")
    val inputText = scanner.nextLine()
    //println("enter number of nuts ")
    val inputText1 = scanner.nextLine()
    println("${inputText1.toInt() % inputText.toInt()} ")
}