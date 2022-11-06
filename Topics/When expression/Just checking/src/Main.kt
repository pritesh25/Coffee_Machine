fun main() {

    val inputNumber = try {
        readln().toInt()
    } catch (e: Exception) {
        0
    }

    when (inputNumber) {
        1, 2, 3, 4 -> {
            print("Yes!")
        }

        else -> {
            print("Unknown number")
        }
    }

}