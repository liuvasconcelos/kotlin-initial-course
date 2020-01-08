package com.example.hellokotlin

fun main() {
    val list = listOf("Kotlin", "Java", "Javascript", "C++", null)

//    list
//        .filterNotNull()
//        .filter {
//            it.startsWith("J")
//        }
//        .map {
//            it.length
//        }
//        .forEach {
//            println(it)
//        }

//    list
//        .filterNotNull()
//        .takeLast(3)
//        .forEach {
//            println(it)
//        }

//    list
//        .filterNotNull()
//        .associate { it to it.length }
//        .forEach {
//            println("${it.value}, ${it.key}")
//        }

    val language = list.filterNotNull().find { it.startsWith("Javaw") }.orEmpty()
    println(language)
}