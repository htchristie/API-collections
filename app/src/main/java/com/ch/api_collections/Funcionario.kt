package com.ch.api_collections

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            Nome:    $nome
            Salário: $salario
        """.trimIndent()
}