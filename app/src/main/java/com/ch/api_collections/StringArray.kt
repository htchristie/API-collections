package com.ch.api_collections

fun main() {
    val colors = arrayOf("blue", "yellow", "pink", "orange", "green")

    colors.sort()
    for (color in colors) {
        println(color)
    }
}