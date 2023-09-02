package collections

fun main() {

    val array = arrayOf("Texas", "Iowa", "California") //Stuck to size limit
    val mixed = arrayOf("Kotlin", 17, 3.0, false)
    val numbers = intArrayOf(1,2,3,4,5)
    println(mixed[0])
    mixed[2] = 3.1415
    println(mixed[2])
    val str = "Udemy"
    println(str[0])
    val states = arrayOf("Nevada","Florida")
    val allStates = array + states
    println(allStates.size)
    numbers.isEmpty()
    if (states.contains("Kentucky")){
        println("Yes")
    } else{
        println("No")
    }

    val list = listOf("Orange","Apple","Bananas") //Not mutable



    val arrayList = arrayListOf("Patrick","Michael","Sarah")
    println(arrayList[0])
    val list2 = arrayListOf("Peter")
    println(arrayList + list2)
    arrayList.add("Josh")
    arrayList.remove("Michael")

}