package me.eltusshouse

fun main(){
    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "Jose"

    for (nome in nomes){
        println(nome)
    }

    println("for usando o metodo sort, onde ele ordena o itens de forma crescente")
    nomes.sort()
    nomes.forEach { println(it) }

    println("lista usando arrayof")
    val nomes2 = arrayOf("Eltuss","Isa","Pedro")
    nomes2.sort()
    nomes2.forEach { println(it) }

}