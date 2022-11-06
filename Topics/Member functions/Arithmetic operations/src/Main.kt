// write your class here
class ArithmeticOperations(var x: Int, var y: Int) {

    fun addition(): Int {
        return x.plus(y)
    }

    fun subtraction(): Int {
        return x.minus(y)
    }

    fun multiplication(): Int {
        return x.times(y)
    }

    fun division(): Int {
        return x.div(y)
    }

}