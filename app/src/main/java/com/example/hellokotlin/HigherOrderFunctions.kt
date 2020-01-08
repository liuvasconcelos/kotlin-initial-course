package com.example.hellokotlin

fun printFilteredStrings(list: List<String>, predicate: ((String) -> Boolean)?) {
    list.forEach {
        if(predicate?.invoke(it) == true ) {
            println(it)
        }
    }
}

fun main() {
    val list = listOf("Kotlin", "Java", "Javascript")
    printFilteredStrings(list) {
        it.startsWith("J")
    }
}

fun getPrintPredicate(): (String) -> Boolean {
    return { it.startsWith("J")}
}