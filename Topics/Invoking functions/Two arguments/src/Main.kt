import java.util.*

// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var d: Int = 2147483647
    d += 1
    println(d) // -2147483648
    println(Int.MAX_VALUE) // -2147483648

}
