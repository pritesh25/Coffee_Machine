fun main() {

    // write your code here
    val directionNumber = readln().toInt()
    when (directionNumber) {
        0 -> {
            print("do not move")
        }

        1 -> {
            print("move up")
        }

        2 -> {
            print("move down")
        }

        3 -> {
            print("move left")
        }

        4 -> {
            print("move right")
        }

        else -> {
            print("error!")
        }
    }

}