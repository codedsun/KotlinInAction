package Basics

class Person(val Name:String, var isMarried :Boolean)

fun main(args:Array<String>){
    var person: Person = Person("Suneet", false)
    println("${person.Name} -- Name +  isMarried -- ${person.isMarried}") //getter
    person.isMarried = true //setter
    println(person.isMarried)

    var rectange: Rectange = Rectange(1,2)
    println(rectange.isSquare)

}

class Rectange(var height:Int, var width:Int){

    val isSquare:Boolean
        get() = height==width


}