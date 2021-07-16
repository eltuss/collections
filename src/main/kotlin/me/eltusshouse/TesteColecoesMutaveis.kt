package me.eltusshouse

fun main(){
    val Joao = Funcionario("Joao", 2000.0, "CLT")
    val Pedro = Funcionario("Pedro", 500.0, "PJ")
    val Maria= Funcionario("Maria", 5000.0, "CLT")

    println("----------montando a lista mutavel(pode ser modificada) somente com joao e maria------------")
    val funcionario = mutableListOf(Joao, Maria)
    funcionario.forEach{ println(it)}
    println("----------adicionando pedro na lista------------")
    funcionario.add(Pedro)
    funcionario.forEach{ println(it)}
    println("----------removendo joao na lista------------")
    funcionario.remove(Joao)
    funcionario.forEach{ println(it)}

    println("----------montando a conjunto mutavel(pode ser modificada) adicionando o joao------------")
    val funcionarioSet = mutableSetOf(Joao)
    funcionarioSet.forEach{ println(it)}
    println("---------- adicionando o Pedro e maria no conjunto ------------")
    funcionarioSet.add(Pedro)
    funcionarioSet.add(Maria)
    funcionarioSet.forEach{ println(it)}
    println("---------- removendo a maria no conjunto ------------")
    funcionarioSet.remove(Maria)
    funcionarioSet.forEach{ println(it)}

}