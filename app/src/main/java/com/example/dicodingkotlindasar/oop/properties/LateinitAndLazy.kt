package com.example.dicodingkotlindasar.oop.properties

//mendeklarasikan dengan nilai null terlebih dahulu
var name: String? = null

//menggunakan lateinit (lateinit harus menggunkan var)
lateinit var name2: String

//mengunakan lazy ( harus menggunakan val  karena nilainya hnya dapat diinisalisaikan 1 kali
val name3: String by lazy {
    "ananda spautra"
}

fun main() {
    name = "Fauzi Ferdiansyah"
    println(name?.length)

    name2 = "Andika Pratama"
    println(name2.length)
    //pengecekan apakah lateinit sudah di isi datanya
    if (::name2.isInitialized)
        println("is Initialized")
    else
        println("Not Initialized")

    println(name3.length)
}