package com.example.hellokotlin

class Person (val firstName: String, val lastName: String ) {
    init {
        println("init 1")
    }

    constructor(): this("Outro", "Nome") {
        println("secondary constructor")
    }

    init {
        println("init 2")
    }

    var nickname: String? = null
        set(value) {
            field = value
            println("nickname setted - $nickname")
        }
        get() {
            println("Get nickname")
            return field
        }
}