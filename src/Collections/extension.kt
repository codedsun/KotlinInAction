package Collections

/**
 * @author : codedsun
 * Created on 14/10/18
 */

fun String.lastChar(): Char = this.get(this.length - 1)

fun main(args: Array<String>) {
    println("Kotlin".lastChar())
}