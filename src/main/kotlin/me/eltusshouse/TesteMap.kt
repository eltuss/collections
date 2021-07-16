package me.eltusshouse

fun main(){
    val pair: Pair<String, Double> = Pair("Joao", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach{(k, v) -> println("Chave: $k - valor: $v")}

    println("--------------------sintaxe do tipo infix------------------------")

    val map2 = mapOf("Pedro" to 2500.0, "Maria" to 4000.0)

    map2.forEach{(k, v) -> println("Chave: $k - valor: $v")}
}