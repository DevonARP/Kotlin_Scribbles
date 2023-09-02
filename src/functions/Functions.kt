package functions

fun helloWorld() {
    println("Hello World!")
}

fun printWithSpaces(text: String){
    for (char in text){
        print(char + " ")
    }
    println()
}

fun main() {
    helloWorld()
    printWithSpaces("Kotlin is awesome!")
}