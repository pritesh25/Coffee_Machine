fun main() {
    // put your code here
    val numberOfElement = readln().toInt()
    if (numberOfElement in 1..1000) {

        val numberList = mutableListOf<Int>()
        while (numberList.size <= numberOfElement - 1) {
            numberList.add(readln().toInt())
        }

        numberList.sortDescending()
        numberList.firstOrNull {
            it % 4 == 0
        }.let {
            print(it)
        }

    } else {
        print("you cant exceed 1000")
    }
}