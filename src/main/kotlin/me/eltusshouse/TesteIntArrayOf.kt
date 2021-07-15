package me.eltusshouse

fun main(){
    val values = intArrayOf(2,3,4,1,10,7)

    values.forEach {
        println(it)
    }

    println("for usando o metodo sort, onde ele ordena o itens de forma crescente")
    values.sort()
    values.forEach{
        println(it)
    }
}