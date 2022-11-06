fun main() {
    // write your code here
    val inputText = readln().toInt()

    if (inputText < 0) {
        println("negative")
    } else if (inputText > 0) {
        println("positive")
    } else {
        println("zero")
    }

}