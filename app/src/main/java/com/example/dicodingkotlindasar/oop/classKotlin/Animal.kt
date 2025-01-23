package com.example.dicodingkotlindasar.oop.classKotlin

class Animal(){
    var name: String = "Anjing"
    var weight: Double = 5.2
    var age: Int = 2
    var isMamalia: Boolean = true


    fun eat(){
        println("$name sedang Makan")
    }

    fun sleep(){
        println("$name sedang Tidur")
    }
}