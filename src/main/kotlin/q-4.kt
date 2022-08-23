fun main(){
    print("Enter the number to check : ")
    val no = readLine()!!.toInt()
    if (no%2==0){
        println("$no is EVEN !!")
    }
    else{
        println("$no is ODD !!")
    }
}