fun main() {
    // write your code here
    val inputNumber = readln().toInt()
    val result = inputNumber in 1..10
    if (result) {
        print(false)
    } else {
        print(true)
    }

}