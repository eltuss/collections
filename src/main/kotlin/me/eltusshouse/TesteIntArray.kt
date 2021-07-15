package me.eltusshouse

fun main(){
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    println("for normal usando in")
    for(valor in values){
        println(valor)
    }

    println("for usando forEach -  onde o it representa a propria variavel")
    values.forEach { println(it) }

    println("for listando baseado no indice dos arrays")
    for (index in values.indices){
        println(values[index])
    }

    println("for usando o metodo sort, onde ele ordena o itens de forma crescente")
    values.sort()
    for (valor in values){
        println(valor)
    }
}