fun main() {

    print("Student Enrollnment Number : ")
    val EnNo: String = readLine()!!.toString()

    print("Student Name : ")
    val Name: String = readLine()!!.toString()

    print("Student Age : ")
    val Age: Int = readLine()!!.toInt()

    print("Student Branch : ")
    val Branch: String = readLine()!!.toString()

    print("Student Class : ")
    val Class: String = readLine()!!.toString()

    print("Student Batch : ")
    val Batch: String = readLine()!!.toString()

    print("Student College Name : ")
    val ClgName: String = readLine()!!.toString()

    print("Student University Name : ")
    val UniName: String = readLine()!!.toString()

    println("\n\n============ Student Data ============")
    println("Enrollnment Name : $EnNo")
    println("Name : $Name")
    println("Age  : $Age")
    println("Branch : $Branch")
    println("Class : $Class")
    println("Batch : $Batch")
    println("College Name : $ClgName")
    println("University Name : $UniName")
}
