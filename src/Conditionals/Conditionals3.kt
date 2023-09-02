package Conditionals

fun main() {

    val x = 10

    when(x) {
        15 -> println("x is 15")
        in 1..10 -> println("Between 1 and 10")
    }
}