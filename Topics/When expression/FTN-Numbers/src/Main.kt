fun main() {
    // put your code here
    val inputNumber = readln().toInt()
    when (inputNumber) {
        0, 1, 2, 3, 5, 8, 13, 21, 34, 55 -> {
            print("F")
        }

        0, 1, 3, 6, 10, 15, 21, 28, 36, 45 -> {
            print("T")
        }

        1, 10, 100, 1000, 10000, 100000 -> {
            print("P")
        }

        else -> {
            print("N")
        }
    }
}