package Basics

fun main(args: Array<String>){
    var percent = 11;
    if(percent in 0..100) println("Yeah, $percent") else throw IllegalArgumentException("Not a valid percent")
    tryCatchCheck(1)
}

fun tryCatchCheck(a :Int){
    try{

        println(a/0)
    }
    catch (e: Exception){
        print(e.localizedMessage)
    }
}