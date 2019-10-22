package Coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

/**
 * @author : codedsun
 * Created on 03/02/19
 */


fun main() {
    runBlocking {
        async {
            doSomeOne()
        }
        async {
            doSomeTwo()

        }
    }
}

suspend fun doSomeOne() {
    delay(1000)
    println("Suneet1")
}

suspend fun doSomeTwo() {
    delay(3000)
    println("Suneet22")
}

