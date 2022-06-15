package com.ch.api_collections

fun main() {
    val oddNumbers = IntArray(7)
    oddNumbers[0] = 1
    oddNumbers[1] = 7
    oddNumbers[2] = 5
    oddNumbers[3] = 3
    oddNumbers[4] = 13
    oddNumbers[5] = 11
    oddNumbers[6] = 9

    for(number in oddNumbers) {
        println(number)
    }

    oddNumbers.forEach {
        println(it)
    }

    oddNumbers.sort()
    oddNumbers.forEach { number ->
        println(number)
    }
}