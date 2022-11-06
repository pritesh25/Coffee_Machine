fun main() {
    // write your code here
    val inputAge = readln().toInt()
    val result = inputAge in 18..59
    if(result){
        print(true)        
    }else{
        print(false)
    }
}
