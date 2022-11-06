import kotlin.math.pow
import kotlin.math.sqrt

fun perimeter(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double = 0.0,
    y4: Double = 0.0
): Double {

    return if (x4 == 0.0 && y4 == 0.00) {
        val from21 = sqrt(((x2 - x1)).pow(2) + ((y2 - y1)).pow(2))
        val from32 = sqrt(((x3 - x2)).pow(2) + ((y3 - y2)).pow(2))
        val from31 = sqrt(((x3 - x1)).pow(2) + ((y3 - y1)).pow(2))
        from21 + from32 + from31
    } else {
        val from21 = sqrt(((x2 - x1)).pow(2) + ((y2 - y1)).pow(2))
        val from32 = sqrt(((x3 - x2)).pow(2) + ((y3 - y2)).pow(2))
        val from43 = sqrt(((x4 - x3)).pow(2) + ((y4 - y3)).pow(2))
        val from41 = sqrt(((x4 - x1)).pow(2) + ((y4 - y1)).pow(2))
        from21 + from32 + from43 + from41
    }

}