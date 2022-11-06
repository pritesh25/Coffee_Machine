import java.util.Scanner

fun main() {
    // put your code here
    val scanner= Scanner(System.`in`)
    val inputNumber  = scanner.nextLine()
    try {
        println(inputNumber[inputNumber.length-2])
    } catch (e: Exception) {
        println("0")
    }
}