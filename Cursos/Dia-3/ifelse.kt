package com.mundocode.androidmasterbyaristidevs.sintaxis

fun main() {
    ifMultipleOR()
}

fun ifMultipleOR() {
    var pet = "cat"
    var isHappy = true

    if(pet == "dog" || (pet == "cat" && isHappy)) {
        println("Es un gato o un perro")
    }

}

fun ifMultiple() {

    var age = 18
    var parentPermission = false
    var imHappy = true

    if(age >= 18 && parentPermission && imHappy) {
        println("Puedo beber")
    }

}

fun ifInt() {

    var age = 29

    if(age > 18) {
        println("Beber cerbeza")
    } else {
        println("Beber Jugp")
    }

}

fun ifBoolean() {
    var soyFeliz = true

    // Sin nada == true
    // Con ! al principio == false
    if(soyFeliz) {
        println("Estoy triste")
    }

}

fun ifAnidado() {
    val animal = "dog"

    if (animal == "dog") {
        println("Es un Perrito!")
    } else if (animal == "cat") {
        println("Es un Gato!")
    } else if (animal == "bird") {
        println("Es un Pajaro!")
    } else {
        println("No es uno de los animales esperados")
    }
}

fun ifBasico() {

    val name = "Juan"

    if(name == "Juan") {
        println("Oye, la variable Name es Juan")
    } else {
        println("Este no es Juan")
    }

}