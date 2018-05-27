package Basics

fun max(var1: Int, var2 :Int) :Int{
    return if(var1>var2) var1 else var2
}

// Another way of declaring function
//Function is an expression here hence we have evaluated the braces
fun max1(a : Int, b:Int ):Int = if(a>b) a else b

fun max2(a: Int, b: Int) = if(a>b)a else b

fun main(args: Array<String>){
    print(max(1,2))
}