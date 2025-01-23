package com.example.dicodingkotlindasar.oop.properties

//roperty Accessor

//tanpa overiding setter getter ( default)

class Animal2{
    var name: String = "Dicoding Miaw"
}

//Menambahkan overriding setter getter
class Animal{
    var name: String = "Dicoding Miaw"
        get(){
            println("fungsi getter terpanggil")
            return field
        }
        set(value) {
            println("Fungsi Setter Terpanggil")
            field = value
        }
}
fun main(){
    val dicodingCat = Animal()
    println("Nama: ${dicodingCat.name}" )
    dicodingCat.name = "Goose"
    println("Nama: ${dicodingCat.name}")
}