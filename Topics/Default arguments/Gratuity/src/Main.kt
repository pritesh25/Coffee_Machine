import kotlin.math.abs

fun tip(bill: Int, percentage: Int = 10): Int {
    val mul = abs(bill).times(abs(percentage))
    return mul.div(100)
}