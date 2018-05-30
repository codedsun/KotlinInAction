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
    //println(getMnemonics(Color.RED))
   // println(getMnemonics(Color.ORANGE))
    println(mix(Color.ORANGE,Color.YELLOW))
    println(mixOptimized(Color.YELLOW,Color.RED))
}

//Use case of when

fun getMnemonics(color:Color):String{
    when(color){
        Color.ORANGE,Color.YELLOW,Color.RED -> return "ALL SELECTED" //for fun, chck the output
        Color.RED -> return "Red"
        Color.YELLOW -> return "Yellow"
        Color.ORANGE -> return "Orange"

    //No Breaks used, only that branch is executed
        //We can combile colors in branch
        Color.ORANGE,Color.YELLOW,Color.RED -> return "ALL SELECTED"
    }
}

fun mix(c1: Color, c2:Color) {
    when(setOf(c1,c2)){
        setOf(Color.RED,Color.YELLOW) -> println(Color.ORANGE)
        setOf(Color.YELLOW,Color.ORANGE) -> println(Color.RED)
    }
}

fun mixOptimized(c1 : Color, c2: Color){
    when{
        ((c1==Color.RED|| c2 == Color.YELLOW) || (c1 == Color.YELLOW|| c2 ==Color.RED)) -> println(Color.ORANGE)
        ((c1==Color.YELLOW||c2==Color.ORANGE) || (c1==Color.ORANGE || c2==Color.YELLOW)) -> println(Color.RED)

        else -> println("Bad color")

    }
}