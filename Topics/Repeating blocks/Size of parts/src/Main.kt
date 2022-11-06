fun main() {
    // put your code here
    val list = arrayListOf<Int>()
    val numberOfInput = readln().toInt()

    while (list.size < numberOfInput) {
        list.add(readln().toInt())
    }

    val perfectCount = list.count {
        it == 0
    }

    val largerCount = list.count {
        it == 1
    }

    val smallerCount = list.count {
        it == -1
    }

    println("$perfectCount $largerCount $smallerCount")

}