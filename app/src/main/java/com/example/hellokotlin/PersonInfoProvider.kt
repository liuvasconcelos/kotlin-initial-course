package com.example.hellokotlin

interface PersonInfoProvider {
    val providerInfo: String
    fun printInfo(person: Person) {
        println(providerInfo)
        println("PRINT DEFAULT")
    }
}

interface SessionInfoProvider {
    fun getSessionId(): String
}


class BasicInfoProvider: PersonInfoProvider, SessionInfoProvider {
    override fun getSessionId(): String {
        return "Session"
    }

    override val providerInfo: String
        get() = "Basic Info "
//    override fun printInfo(person: Person) {
//        println("PRINT")
//    }
}

fun main() {
    val provider = BasicInfoProvider()

    checkTypes(provider)
}

fun checkTypes(infoProvider: PersonInfoProvider) {
   if (infoProvider !is SessionInfoProvider)  {
       println("Not Session Provider")
   } else {
       println("Session provider")
       println(infoProvider.getSessionId())
//       println((infoProvider as SessionInfoProvider).getSessionId())
   }
}