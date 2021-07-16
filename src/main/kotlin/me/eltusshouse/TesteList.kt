package me.eltusshouse

fun main(){
    val Joao = Funcionario("Joao", 2000.0, "CLT")
    val Pedro = Funcionario("Pedro", 500.0, "PJ")
    val Maria= Funcionario("Maria", 5000.0, "CLT")

    val funcionario = listOf(Joao, Pedro,Maria)

    funcionario.forEach{ println(it)}

    println("---------------------------------")
    println(funcionario.find { it.nome == "Maria" })
    println("--------------metodo encadeado por ondem do menor para o maior-------------")
    funcionario.sortedBy { it.salario }.forEach{ println(it)}
    println("--------------metodo encadeado por grupo-------------")
    funcionario.groupBy { it.tipoContratacao }.forEach{ println(it)}



}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
){
    override fun toString(): String =
        """
            Nome: $nome
            Salario: $salario
        """.trimIndent()
}