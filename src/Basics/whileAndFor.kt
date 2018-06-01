package Basics

fun main(args: Array<String>){
    var i =0;
    val j =0;
    while(i>=0){
        println("Suneet, $i")
        i--
    }

    do{
        println("Do Suneet, $i")
        i++
    }while(i<=0)

    //FizBuzz Game
    var range = 1..50
    for(i in range){
        if(i%3==0) println("Fizz")
        else if (i%5 ==0) println("Buz") else println("Fuzz Bizz")
    }

    for(i in 10 downTo 1){
        println("$i * 2 = ${i*2}")
    }

}