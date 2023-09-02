package Conditionals

fun main() {
    val mode: Int = 5

    when (mode){
        1 -> println("Lazy")
        2 -> {
            println("Busy")
        }
        3 -> println("Productive")
        else -> println("IDK")
    }

    val result = when (mode){
        1 -> "Lazy"
        2 -> {
            "Busy"
        }
        3 -> "Productive"
        else -> "IDK"
    }

    println(result)

    mode

    if (true){

    }
}