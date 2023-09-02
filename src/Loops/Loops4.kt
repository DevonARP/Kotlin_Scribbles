package Loops

fun main() {

    outer@ for(i in 1..10){
        for (j in 1..10){
            break@outer
        }
    }

}