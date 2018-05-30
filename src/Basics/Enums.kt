package Basics

enum class Color(var r:Int, var b: Int, var g: Int){
    RED(255,0,0),ORANGE(255,165,0)
    ,YELLOW(255,254,0);

    fun rgb(): Int{
        return (r*256+g)*256+b
    }

}
fun main(args:Array<String>)  {
    println(Color.RED.rgb())
}