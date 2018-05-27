package Basics

val Suneet:String = "Suneet"
val name = "Suneet Srivastava" //Final variable in java
var name1 = 1 //Mutable in java, not final


fun main(args: Array<String>) {
    System.out.println(Suneet.javaClass)
    System.out.println(name.javaClass)
    name1 += 20

    val msg = (if(args.size>0) args[0] else "kotlin")
    println("Hello $msg")

}