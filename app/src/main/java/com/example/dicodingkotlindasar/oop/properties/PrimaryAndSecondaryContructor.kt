package com.example.dicodingkotlindasar.oop.properties

//Primary Contructor ans
class Animalls(val name: String, val weight: Double, val age: Int, val isMammal: Boolean)

//Primary Constructor with default value
class Animalls2(
    var name: String,
    var weight: Double,
    var age: Int = 0,
    var isMammal: Boolean = true
)

//Init block
class Animalls3(pName: String, pWeight: Double, pAge: Int, pIsMamalia: Boolean) {
    val name: String
    val weight: Double
    val age: Int
    val isMamalia: Boolean

    init {
        weight = if (pWeight < 0) 0.1 else pWeight
        age = if (pAge < 0) 0 else pAge
        name = pName
        isMamalia = pIsMamalia
    }
}

//Init block white this
class Animalls4(name: String, weight: Double, age: Int, isMamalia: Boolean) {
    val name: String
    val weight: Double
    val age: Int
    val isMamalia: Boolean

    init {
        this.weight = if (weight < 0) 0.1 else weight
        this.age = if (age < 0) 0 else age
        this.name = name
        this.isMamalia = isMamalia
    }
}

/*Secondary Constructror*/
class Animalls5(name: String, weight: Double, age: Int) {
    val name: String
    val weight: Double
    val age: Int
    var isMammal: Boolean

    init {
        this.weight = if (weight < 0) 0.1 else weight
        this.age = if (age < 0) 0 else age
        this.name = name
        this.isMammal = false
    }

    constructor(name: String, weight: Double, age: Int, isMammal: Boolean) : this(
        name,
        weight,
        age
    ) {
        this.isMammal = isMammal
    }
}


fun main() {

    val dicodingCat = Animalls("Dicoding Miaw", 4.2, 2, true)
    println("Nama : ${dicodingCat.name}, Berat : ${dicodingCat.weight}, " + "Umur : ${dicodingCat.age}, Mamalia : ${dicodingCat.isMammal} ")

    val dicodingCat2 = Animalls2("Marvel", 1.1)
    println("Nama : ${dicodingCat2.name}, Berat : ${dicodingCat2.weight}, " + "Umur : ${dicodingCat2.age}, Mamalia : ${dicodingCat2.isMammal} ")

    val dicodingCat3 = Animalls3("Udin", 0.9, 11, true)
    println("Nama : ${dicodingCat3.name}, Berat : ${dicodingCat3.weight}, " + "Umur : ${dicodingCat3.age}, Mamalia : ${dicodingCat3.isMamalia} ")

    val dicodingCat4 = Animalls4("agus", 3.9, 10, true)
    println("Nama : ${dicodingCat4.name}, Berat : ${dicodingCat4.weight}, " + "Umur : ${dicodingCat4.age}, Mamalia : ${dicodingCat4.isMamalia} ")

    val dicodingCat5 = Animalls5("Dicoding Miaw", 2.5, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")

    val dicodingBird = Animalls5("Dicoding tweet", 0.5, 1)
    println("Nama: ${dicodingBird.name}, Berat: ${dicodingBird.weight}, Umur: ${dicodingBird.age}, mamalia: ${dicodingBird.isMammal}")
}
