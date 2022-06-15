package com.ch.api_collections

fun main() {
    val years = doubleArrayOf(1000.0, 2000.0, 3000.0)

    years.forEachIndexed { index, year ->
        years[index] = year - 100
    }

    years.forEach { println(it) }
}