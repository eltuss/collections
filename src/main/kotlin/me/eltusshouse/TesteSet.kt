package me.eltusshouse

fun main(){
    val Joao = Funcionario("Joao", 2000.0, "CLT")
    val Pedro = Funcionario("Pedro", 500.0, "PJ")
    val Maria= Funcionario("Maria", 5000.0, "CLT")

    val funcionario1 = setOf(Joao, Pedro)
    val funcionario2 = setOf(Maria)

    println("------une os dois conjuntos de funcionarios-----------------")
    val resultUnion = funcionario1.union(funcionario2)
    resultUnion.forEach{ println(it)}
    println("----------tira o que funcionario que pertence a outro conjunto-----------")
    val funcionario3 = setOf(Joao, Pedro, Maria)
    val resultSubtracao = funcionario3.subtract(funcionario2)
    resultSubtracao.forEach{ println(it)}
    println("---------mostra o funcionario em comum em ambos os conjuntos-------------")
    val resultIntersect = funcionario3.intersect(funcionario2)
    resultIntersect.forEach{ println(it)}
    println("---------------------------------")

}