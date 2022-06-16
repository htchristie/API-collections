package com.ch.api_collections

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("----------")

    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("----------")

    funcionarios.remove(maria)
    funcionarios.forEach { println(it) }

    println("----------")

    funcionarios.removeAt(0)
    funcionarios.forEach { println(it) }
}