package com.example.androidkotlin

class Aquarium3_2 {
    var width: Int = 20
    var height: Int = 40
    var length: Int = 100

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }
}

//no.3 add class constructors//

class Aquarium3_3(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    init {
        println("aquarium initializing")
        println("Volume: ${width * length * height / 1000} liters")
    }

    constructor(numberOfFish: Int) : this() {
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

    var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm "
        )
        println("Volume: $volume liters")
    }
}

fun buildAquarium3_2() {
    val myAquarium = Aquarium3_2()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()
}

fun buildAquarium3_3() {
    val aquarium1 = Aquarium3_3()
    aquarium1.printSize()

    val aquarium2 = Aquarium3_3(width = 25)
    aquarium2.printSize()

    val aquarium3 = Aquarium3_3(height = 35, length = 110)
    aquarium3.printSize()

    val aquarium4 = Aquarium3_3(width = 25, height = 35, length = 110)
    aquarium4.printSize()

    val aquarium5 = Aquarium3_3(29)
    aquarium5.printSize()

    val aquarium6 = Aquarium3_3(numberOfFish = 29)
    aquarium6.printSize()

    aquarium6.volume = 70
    aquarium6.printSize()
}

fun main() {
    buildAquarium3_2()
    buildAquarium3_3()
}