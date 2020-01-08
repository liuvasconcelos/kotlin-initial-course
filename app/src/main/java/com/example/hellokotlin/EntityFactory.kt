package com.example.hellokotlin

import java.util.*

enum class EntityType {
    HELP, EASY, MEDIUM, HARD;

    fun getFormattedName() = name.toLowerCase().capitalize()
}

object EntityFactory {
    fun create(type: EntityType) : Entity {
        val id = UUID.randomUUID().toString()
        val name = when(type) {
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD -> "Hard"
            EntityType.HELP -> type.getFormattedName()
        }



//        return Entity(id, name)
        return when(type) {
            EntityType.EASY -> Entity.Easy(id, name)
            EntityType.MEDIUM -> Entity.Medium(id, name)
            EntityType.HARD -> Entity.Hard(id, name, 2f)
            EntityType.HELP -> Entity.Help
        }
    }
}

//class Entity(val id: String, val name: String) {
//    override fun toString(): String {
//        return "id: $id name: $name"
//     }
//}

sealed class Entity() {

    object Help: Entity() {
        val name = "help"
    }

    data class Easy(val id: String, val name: String): Entity() {
        override fun equals(other: Any?): Boolean {
            return super.equals(other)
        }

        override fun hashCode(): Int {
            return super.hashCode()
        }
    }
    data class Medium(val id: String, val name: String): Entity()
    data class Hard(val id: String, val name: String, val multiplier: Float ): Entity()
}

fun Entity.Medium.printInfo() {
    println("Medium class with id $id")
}

fun main() {
//    val entity: Entity = EntityFactory.create(EntityType.EASY)
//    val msg = when(entity) {
//        Entity.Help -> "Help class"
//        is Entity.Easy -> "Easy class"
//        is Entity.Medium -> "Medium class"
//        is Entity.Hard -> "hard class"
//    }
//
//    println(msg)

//    val entity1 = Entity.Easy("id", "name")
////    val entity2 = Entity.Easy("id", "name")
////    val entity3 = entity1.copy("new name")
////
////    if (entity1 === entity2 ) {
////        println("they are equal")
////    } else {
////        println("they are not equal")
////    }

    Entity.Medium("id medium", "name").printInfo()
}