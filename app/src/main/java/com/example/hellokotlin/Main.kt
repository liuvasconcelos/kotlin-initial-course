package com.example.hellokotlin

var name: String? = null

fun main() {
//    val nameToPrint = if (name != null) name else "Opa"
    val nameToPrint = name ?: "Opa"
    when (nameToPrint) {
        null -> {
            println("NULO ")
            println("----")
        }

        else -> println("Not null")
    }

//    val testandoArray = arrayOf("Element 1", "Element 2")
//    sayHelloTo(teste = "oi", any = *testandoArray)

    // Init 1, Init 2
//    val person = Person("Liu", "Vasconcelos")

    // Init 1, Init 2, Secondary constructor
//    val person2 = Person()
//    person2.nickname = "Liu"
//
//    println("Tentando pegar o nickname - ${person2.nickname}")
}

fun sayHelloTo(vararg any: String, teste: String) = any.forEach { println(it) }