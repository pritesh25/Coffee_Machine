fun main() {
    // write your code here
    val input1 = readln().toInt()
        val input2 = readln().toInt()
            val input3 = readln().toInt()
                val input4 = readln().toInt()
                      val input5 = readln().toInt()

                      val range1 = input5 in input1..input2
                      val range2 = input5 in input3..input4

    if(range1 && range2){
        print("true")
    }else{
                print("false")
    }               
}
