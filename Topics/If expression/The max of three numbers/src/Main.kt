fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    if (a > c) {
        // put your code here
        if (a > b) {
            print(a)
        } else {
            print(b)
        }
    } else {
        // and here
        if (c > b) {
            print(c)
        } else {
            print(b)
        }
    }

}