fun main() {
    // put your code here
    val input1 = readln().toInt()
    var input2 = readln().toInt()
    var input3 = readln().toInt()

    var temp = 0

    if (input2 > input3) {
        temp = input2
        input2 = input3
        input3 = temp
    }


    if (input2 < input1 && input1 <= input3) {
        println("true")
    } else if (input2 == input1 && input1 == input3) {
        println("true")
    } else {
        println("false")
    }

}