package Collections

fun main(args : Array<String>){
    val set = setOf(1,23,4,5,6)
    val hashset  = hashSetOf(1,2,3,4)
    val arrayList = hashSetOf(1,2,3)
    println(set)
    println(hashset)
    println(arrayList)
    println(joinToString(hashset, ",","(",")"))
}

fun<T> joinToString(collection : Collection<T>, seperator : String, prefix:String, postfix:String) :String{
    val res = StringBuilder(prefix)
    collection.forEachIndexed{
        index,t -> if(index>0) res.append(seperator)
        res.append(t)

    }

    res.append(postfix)
    return res.toString()


}