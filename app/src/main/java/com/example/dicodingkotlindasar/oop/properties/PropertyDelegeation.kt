package com.example.dicodingkotlindasar.oop.properties

import kotlin.reflect.KProperty

//Property delegation adalah mekanisme yang memungkinkan kamu untuk mendelegasikan tanggung jawab pengelolaan properti
//(mendapatkan dan menetapkan nilai) kepada objek lain yang disebut delegate.

class DelegateName {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>): String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String) {
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Class1 {
    var name: String by DelegateName()
}

class Class2 {
    var name: String by DelegateName()
}

//menggunakan any
class DelegateGenericClass {
    private var value: Any = "Default"

    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any) {
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Hewan {
    var name: Any by DelegateGenericClass()
    var weight: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
}

fun main() {
    val Andi = Class1()
    val Redi = Class2()
    Andi.name = "Andi Wijaya Ahmad"
    Redi.name = "Redi Asmara"

    println("Nama Panjang Andi: ${Andi.name}")
    println("Nama Panjang Redi: ${Redi.name}")

    val hewan = Hewan()
    hewan.name = "Kucing"
    hewan.weight = 41
    hewan.age = 10

    println("Nama: ${hewan.name}")
    println("Berat: ${hewan.weight}")
    println("Umur: ${hewan.age} Tahun")
}