/**
 * @author : codedsun
 * Created on 28/10/18
 */

fun addValue(operation: (Int, Int)->Int):Int {
    return operation(10,20)
}

fun main(args: Array<String>) {
    print(addValue { num1, num2 -> num1 * num2 })
}