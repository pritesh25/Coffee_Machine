fun main() {
    // put your code here
    val list = arrayListOf<Int>()
    val inputNumber = readln().toInt()

    while (list.size < inputNumber) {
        list.add(readln().toInt())
    }

    val d = list.count {
        it == 2
    }

    val c = list.count {
        it == 3
    }

    val b = list.count {
        it == 4
    }

    val a = list.count {
        it == 5
    }

    println("$d $c $b $a")

}