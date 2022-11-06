fun main() {
    // put your code here
    val list = ArrayList<Int>()
    val inputText = readln().toInt()
    while(list.size < inputText){
        list.add(readln().toInt())
    }

    val count = list.filter{
        it > 0
    }
    
    println(count.size)
    
}
