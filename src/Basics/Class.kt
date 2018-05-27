package Basics

class Person(val Name:String, var isMarried :Boolean)

fun main(args:Array<String>){
    var person: Person = Person("Suneet", false);
    println("${person.Name} -- Name +  isMarried -- ${person.isMarried}") //getter
    person.isMarried = true //setter
    print(person.isMarried)

}