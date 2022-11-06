// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
  // put your code here
    val mercedes = false
    val red = false
    val enoughMoney = true

    val buyCar = enoughMoney && (!mercedes || red)
    println(buyCar)
}
