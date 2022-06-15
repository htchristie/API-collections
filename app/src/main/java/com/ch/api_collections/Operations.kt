package com.ch.api_collections

fun main() {
    val ages = doubleArrayOf(23.5, 25.2, 26.6, 27.0, 28.6)
    println(ages.minOrNull())
    println(ages.maxOrNull())
    println(ages.average())

    val olderThan = ages.filter{ it > 24.0 }
    olderThan.forEach { println(it) }

    println(ages.count { it in 26.0..28.0 })
    println(ages.find { it == 25.2 }) //retorna valor
    println(ages.any { it == 25.2 }) //retorna boolean
}