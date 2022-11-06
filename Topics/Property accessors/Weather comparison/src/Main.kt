class City(val name: String) {
    var degrees: Int = 0

    fun validateDegree() {
        if (degrees < -92 || degrees > 57) {

            when (name) {
                "Dubai" -> {
                    degrees = 30
                }

                "Moscow" -> {
                    degrees = 5
                }

                "Hanoi" -> {
                    degrees = 20
                }

                else -> {

                }
            }

        }

    }

    override fun toString(): String {
        return "$name <=> $degrees"
    }

}

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    //implement comparing here
    firstCity.validateDegree()
    secondCity.validateDegree()
    thirdCity.validateDegree()

    val listCity = arrayListOf(firstCity, secondCity, thirdCity)

    //sorting and count
    listCity.sortBy {
        it.degrees
    }

    val count = listCity.distinctBy {
        it.degrees
    }.count()

    if (count == listCity.size) {
        println(listCity.first().name)
    } else {
        println("neither")
    }
}