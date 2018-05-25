data class Person(var name : String, var age : Int?=null)

fun main(args: Array<String>){

    val persons = listOf<Person>(Person("Suneet"),Person("Navneet",29));
    println(persons.maxBy{ it.age?:0 });

}