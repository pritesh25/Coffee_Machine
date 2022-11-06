fun main() {
    // write your code here
    val inputText = readln()
    when (inputText) {
        "gryffindor" -> {
            println("bravery")
        }
        "hufflepuff" -> {
            println("loyalty")
        }
        "slytherin" -> {
            println("cunning")
        }
        "ravenclaw" -> {
            println("intellect")
        }
        else -> {
            println("not a valid house")
        }
    }

}