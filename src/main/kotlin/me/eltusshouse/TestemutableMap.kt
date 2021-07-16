package me.eltusshouse

fun main() {
    val Joao = Funcionario("Joao", 2000.0, "CLT")
    val Pedro = Funcionario("Pedro", 500.0, "PJ")
    val Maria= Funcionario("Maria", 5000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(Joao.nome, Joao)
    repositorio.create(Pedro.nome, Pedro)
    repositorio.create(Maria.nome, Maria)

    println(repositorio.findById(Joao.nome))
    println("---------usei a função da outra classe para buscar todos ----------------")
    repositorio.findAll().forEach{ println(it)}
    println("---------usei a função da outra classe para remover um funcionario ----------------")
    repositorio.remove(Pedro.nome)
    repositorio.findAll().forEach{ println(it)}

}