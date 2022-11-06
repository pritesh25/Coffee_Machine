fun main() {
    // write your code here
    val a = readln().toInt()
    val b = readln().toInt()
    val h = readln().toInt()
    if (a <= h && h <= b) {
        print("Normal")
    } else if (h > b) {
        print("Excess")
    } else {
        print("Deficiency")
    }

}