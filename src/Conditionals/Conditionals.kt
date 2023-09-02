package Conditionals

fun main() {
    val age: Int = 19

    if (age < 18) {
        println("You cannot register.")
    } else if (age < 21) {
        println("Maybe you can register.")
    }
    else {
        println("You're good to go.")
    }
}