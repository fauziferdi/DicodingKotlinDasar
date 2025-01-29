package com.example.dicodingkotlindasar.oop

//inheritance

open class Animal(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean) {

    open fun eat() {
        println("$name sedang makan!")
    }

    open fun sleep() {
        println("$name sedang tidur!")
    }
}

class Cat(
    pName: String,
    pWeight: Double,
    pAge: Int,
    pIsCarnivore: Boolean,
    val furColor: String,
    val numberOfFeet: Int
) : Animal(pName, pWeight, pAge, pIsCarnivore) {

    fun playWithHuman() {
        println("$name bermain bersama Manusia !")
    }

    override fun eat() {
        println("$name sedang memakan ikan !")
    }

    override fun sleep() {
        println("$name sedang tidur di bantal !")
    }
}

// hanya ingin menambahkan implementasi dari yang sudah di parent class

open class Animal2(val name: String) {
    open fun eat() {
        println("$name sedang makan!")
    }
}


class Cat2(pName: String) : Animal2(pName) {
    override fun eat() {
        super.eat()
        println("$name sedang memakan ikan !")
    }
}


fun main() {
    val dicodingCat = Cat("Dicoding Miaw", 3.2, 2, true, "Brown", 4)

    dicodingCat.playWithHuman()
    dicodingCat.eat()
    dicodingCat.sleep()


    val dicodingCat2 = Cat2("Dicoding Miaw")
    dicodingCat2.eat()

}
