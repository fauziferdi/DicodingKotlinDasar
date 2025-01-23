package com.example.dicodingkotlindasar.oop.classKotlin

fun main(){
    val hewan = Animal()
    println("Nama: ${hewan.name}, Berat: ${hewan.weight}, Umur: ${hewan.age}, mamalia: ${hewan.isMamalia}" )
    hewan.eat()
    hewan.sleep()

    //ubah data variabel class
    hewan.name = "kucing"
    hewan.weight = 6.0
    hewan.age = 3
    println("Nama: ${hewan.name}, Berat: ${hewan.weight}, Umur: ${hewan.age}, mamalia: ${hewan.isMamalia
    }" )
    hewan.eat()
    hewan.sleep()
}